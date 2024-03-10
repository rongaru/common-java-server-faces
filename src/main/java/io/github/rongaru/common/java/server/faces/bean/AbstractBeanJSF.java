package io.github.rongaru.common.java.server.faces.bean;

import io.github.rongaru.common.java.server.faces.utility.FacesMessageUtility;
import io.github.rongaru.common.java.server.faces.utility.FacesScreenUtility;

public abstract class AbstractBeanJSF< DataModelJSF, AuthenticationDataModelJSF > {

	protected DataModelJSF dataModelJSF;

	protected AuthenticationDataModelJSF authenticationDataModelJSF;

	protected abstract String getAccessDeniedScreen( );

	protected abstract String getAccessAllowedScreen( );

	protected abstract void deleteAndCreateDataModelJSF( );

	protected abstract boolean isUserHasAccessAllowedToScreen( );

	protected abstract void setScreenRedirectionDefaultParameters( );

	protected abstract void deleteUselessSessionScopedDataModelJSF( );

	protected DataModelJSF getDataModelJSF( ) {
		return dataModelJSF;
	}

	protected void setDataModelJSF( DataModelJSF dataModelJSF ) {
		this.dataModelJSF = dataModelJSF;
	}

	protected AuthenticationDataModelJSF getAuthenticationDataModelJSF( ) {
		return authenticationDataModelJSF;
	}

	protected void setAuthenticationDataModelJSF( AuthenticationDataModelJSF authenticationDataModelJSF ) {
		this.authenticationDataModelJSF = authenticationDataModelJSF;
	}

	public String redirectToScreen( ) {
		if ( isUserHasAccessAllowedToScreen( ) ) {
			deleteAndCreateDataModelJSF( );
			setScreenRedirectionDefaultParameters( );
			deleteUselessSessionScopedDataModelJSF( );
			return getAccessAllowedScreen( );
		}
		String accessDeniedScreen = getAccessDeniedScreen( );
		FacesMessageUtility.createErrorMessage( "Access Denied" );
		return FacesScreenUtility.redirect( accessDeniedScreen );
	}

}
