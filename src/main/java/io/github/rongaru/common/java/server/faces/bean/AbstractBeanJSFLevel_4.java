package io.github.rongaru.common.java.server.faces.bean;

abstract class AbstractBeanJSFLevel_4< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSFLevel_3< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	protected abstract String getAccessDeniedScreen( );

	protected abstract String getAccessAllowedScreen( );

	protected abstract boolean isUserHasAccessAllowedToScreen( UserDto userDto );

	protected abstract < Target > Class< Target > getParameterizedInstanceClass( int index, Target instance );

}
