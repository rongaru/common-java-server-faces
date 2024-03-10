package io.github.rongaru.common.java.server.faces.model;

public abstract class AbstractTransactionalDataModelJSF< Dto > extends AbstractDataModelJSF< Dto > {

	protected Dto record;

	protected boolean createEditPanel;

	protected boolean createPermission;

	protected boolean updatePermission;

	protected boolean deletePermission;

	public Dto getRecord( ) {
		return record;
	}

	public void setRecord( Dto record ) {
		this.record = record;
	}

	public boolean isCreateEditPanel( ) {
		return createEditPanel;
	}

	public void setCreateEditPanel( boolean createEditPanel ) {
		this.createEditPanel = createEditPanel;
	}

	public boolean isCreatePermission( ) {
		return createPermission;
	}

	public void setCreatePermission( boolean createPermission ) {
		this.createPermission = createPermission;
	}

	public boolean isUpdatePermission( ) {
		return updatePermission;
	}

	public void setUpdatePermission( boolean updatePermission ) {
		this.updatePermission = updatePermission;
	}

	public boolean isDeletePermission( ) {
		return deletePermission;
	}

	public void setDeletePermission( boolean deletePermission ) {
		this.deletePermission = deletePermission;
	}

}
