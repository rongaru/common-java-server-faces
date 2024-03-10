package io.github.rongaru.common.java.server.faces.bean;

import java.util.ArrayList;
import java.util.List;

import io.github.rongaru.common.java.server.faces.model.AbstractAuthenticationDataModelJSF;
import io.github.rongaru.common.java.server.faces.model.AbstractDataModelJSF;

abstract class AbstractBeanJSFLevel_5< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_4< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	protected List< Dto > getDataTableRecords( ) {
		return new ArrayList<>( );
	}

	protected void setScreenRedirectionDefaultParameters( ) {
		List< Dto > records = getDataTableRecords( );
		getAbstractDataModelJSF( ).setRecords( records );
	}

	protected AbstractDataModelJSF< Dto > getAbstractDataModelJSF( ) {
		DataModelJSF dataModelJSF1 = getDataModelJSF( );
		return ( AbstractDataModelJSF ) dataModelJSF1;
	}

	protected AbstractAuthenticationDataModelJSF< UserDto > getAbstractAuthenticationDataModelJSF( ) {
		return ( AbstractAuthenticationDataModelJSF ) authenticationDataModelJSF;
	}

}
