package io.github.rongaru.common.java.server.faces.bean;

public abstract class AbstractTabPanelBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF, Event > extends AbstractBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	protected abstract void setSelectedTabItemBeanJSFParameters( Event event );

	public void navigateToSelectedTab( Event event ) {
		deleteUselessSessionScopedDataModelJSF( );
		setSelectedTabItemBeanJSFParameters( event );
	}

}
