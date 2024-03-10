package io.github.rongaru.common.java.server.faces.bean;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

abstract class AbstractBeanJSFLevel_1< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	@Inject
	protected Service service;

	@Inject
	protected BeanManager beanManager;

	@Inject
	protected DataModelJSF dataModelJSF;

	@Inject
	protected AuthenticationDataModelJSF authenticationDataModelJSF;

}
