package io.github.rongaru.common.java.server.faces.bean;

import java.util.Collections;

import io.github.rongaru.common.java.server.faces.utility.ContextManagedBeanUtility;

abstract class AbstractBeanJSFLevel_6< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_5< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	protected UserDto getSessionUserDto( ) {
		return getAbstractAuthenticationDataModelJSF( ).getUserDto( );
	}

	protected void deleteAndCreateDataModelJSF( ) {
		Class< DataModelJSF > dataModelJSFClass = getParameterizedInstanceClass( dataModelJSF );
		dataModelJSF = ContextManagedBeanUtility.destroyAndConstructContextManagedBean( beanManager, dataModelJSFClass );
	}

	protected void deleteUselessSessionScopedDataModelJSF( ) {
		Class< DataModelJSF > dataModelJSFClass = getParameterizedInstanceClass( dataModelJSF );
		ContextManagedBeanUtility.destroyUselessSessionScopedDataModelJSFManagedBeansNotIn( beanManager, Collections.singletonList( dataModelJSFClass ) );
	}

}
