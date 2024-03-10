package io.github.rongaru.common.java.server.faces.model;

import java.util.List;

public abstract class AbstractDataModelJSF< Dto > {

	protected List< Dto > records;

	public List< Dto > getRecords( ) {
		return records;
	}

	public void setRecords( List< Dto > records ) {
		this.records = records;
	}

}
