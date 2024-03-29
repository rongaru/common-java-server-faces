package io.github.rongaru.common.java.server.faces.bean;

public abstract class AbstractTransactionalBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	public abstract void initEdit( );

	public abstract void initCreate( );

	public abstract void initDelete( );

	protected abstract Dto getDtoInstance( );

	public abstract String writeToDatabase( );

	protected abstract String saveToDatabase( );

	protected abstract String updateToDatabase( );

	protected abstract String deleteToDatabase( );

	protected abstract void setAuthorizedScreenPermissions( );

}
