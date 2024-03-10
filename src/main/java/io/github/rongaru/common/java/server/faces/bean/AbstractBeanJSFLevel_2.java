package io.github.rongaru.common.java.server.faces.bean;

import javax.enterprise.inject.spi.BeanManager;

abstract class AbstractBeanJSFLevel_2< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_1< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	public Service getService( ) {
		return service;
	}

	public BeanManager getBeanManager( ) {
		return beanManager;
	}

	public DataModelJSF getDataModelJSF( ) {
		return dataModelJSF;
	}

	public AuthenticationDataModelJSF getAuthenticationDataModelJSF( ) {
		return authenticationDataModelJSF;
	}

}
