package io.github.rongaru.common.java.server.faces.bean;

public abstract class AbstractTabPanelBeanJSF< DataModelJsf, AuthenticationDataModelJsf, Event > extends AbstractBeanJSF< DataModelJsf, AuthenticationDataModelJsf > {

	protected abstract void setSelectedTabItemBeanJSFParameters( Event event );

	public void navigateToSelectedTab( Event event ) {
		deleteUselessSessionScopedDataModelJSF( );
		setSelectedTabItemBeanJSFParameters( event );
	}

}
