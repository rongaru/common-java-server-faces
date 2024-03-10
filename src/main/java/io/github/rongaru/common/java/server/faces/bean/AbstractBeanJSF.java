package io.github.rongaru.common.java.server.faces.bean;

import io.github.rongaru.common.java.server.faces.utility.FacesMessageUtility;
import io.github.rongaru.common.java.server.faces.utility.FacesScreenUtility;

public abstract class AbstractBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_6< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	public String redirectToScreen( ) {
		UserDto userDto = getSessionUserDto( );
		if ( isUserHasAccessAllowedToScreen( userDto ) ) {
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
