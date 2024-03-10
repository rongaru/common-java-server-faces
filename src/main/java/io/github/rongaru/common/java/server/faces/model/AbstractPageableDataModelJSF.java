package io.github.rongaru.common.java.server.faces.model;

public abstract class AbstractPageableDataModelJSF< Dto, Pagination > extends AbstractDataModelJSF< Dto > {

	protected String search;

	protected Pagination pagination;

	public String getSearch( ) {
		return search;
	}

	public void setSearch( String search ) {
		this.search = search;
	}

	public Pagination getPagination( ) {
		return pagination;
	}

	public void setPagination( Pagination pagination ) {
		this.pagination = pagination;
	}

}
