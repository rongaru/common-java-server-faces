package io.github.rongaru.common.java.server.faces.bean;

public abstract class AbstractTransactionalPageableBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > extends AbstractTransactionalBeanJSF< Dto, Service, UserDto, DataModelJSF, AuthenticationDataModelJSF > {

	public abstract void setRecordsPerPage( );

	protected abstract int getTotalRecordsCount( );

	protected abstract void setDataTableRecords( );

}
