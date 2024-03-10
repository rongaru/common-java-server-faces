package io.github.rongaru.common.java.server.faces.bean;

import java.util.List;

public abstract class AbstractPageableBeanJSF< Dto, DataModelJsf, AuthenticationDataModelJsf > extends AbstractBeanJSF< DataModelJsf, AuthenticationDataModelJsf > {

	public abstract void setRecordsPerPage( );

	protected abstract int getTotalRecordsCount( );

	protected abstract void setDataTableRecords( );

	protected abstract List< Dto > getDataTableRecords( );

}

