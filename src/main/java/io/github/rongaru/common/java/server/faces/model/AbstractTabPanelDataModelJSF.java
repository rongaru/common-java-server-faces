package io.github.rongaru.common.java.server.faces.model;

public abstract class AbstractTabPanelDataModelJSF< Dto > extends AbstractDataModelJSF< Dto > {

	protected int activeTabIndex;

	public int getActiveTabIndex( ) {
		return activeTabIndex;
	}

	public void setActiveTabIndex( int activeTabIndex ) {
		this.activeTabIndex = activeTabIndex;
	}

}
