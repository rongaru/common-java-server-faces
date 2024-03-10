package io.github.rongaru.common.java.server.faces.bean;

import javax.enterprise.inject.spi.BeanManager;

abstract class AbstractBeanJSFLevel_3< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_2< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	public void setService( Service service ) {
		this.service = service;
	}

	public void setBeanManager( BeanManager beanManager ) {
		this.beanManager = beanManager;
	}

	public void setDataModelJSF( DataModelJSF dataModelJSF ) {
		this.dataModelJSF = dataModelJSF;
	}

	public void setAuthenticationDataModelJSF( AuthenticationDataModelJSF authenticationDataModelJSF ) {
		this.authenticationDataModelJSF = authenticationDataModelJSF;
	}

}
