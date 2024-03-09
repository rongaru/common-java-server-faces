package io.github.rongaru.common.java.server.faces.utility;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesMessageUtility {

	public static void createInfoMessage( String summary ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_INFO, summary, null ) );
	}

	public static void createWarnMessage( String summary ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_WARN, summary, null ) );
	}

	public static void createErrorMessage( String summary ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_ERROR, summary, null ) );
	}

	public static void createFatalMessage( String summary ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_FATAL, summary, null ) );
	}

	public static void createInfoMessage( String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_INFO, summary, detail ) );
	}

	public static void createWarnMessage( String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_WARN, summary, detail ) );
	}

	public static void createErrorMessage( String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_ERROR, summary, detail ) );
	}

	public static void createFatalMessage( String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( null, new FacesMessage( FacesMessage.SEVERITY_FATAL, summary, detail ) );
	}

	public static void createInfoMessage( String componentId, String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( componentId, new FacesMessage( FacesMessage.SEVERITY_INFO, summary, detail ) );
	}

	public static void createWarnMessage( String componentId, String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( componentId, new FacesMessage( FacesMessage.SEVERITY_WARN, summary, detail ) );
	}

	public static void createErrorMessage( String componentId, String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( componentId, new FacesMessage( FacesMessage.SEVERITY_ERROR, summary, detail ) );
	}

	public static void createFatalMessage( String componentId, String summary, String detail ) {
		FacesContext.getCurrentInstance( ).addMessage( componentId, new FacesMessage( FacesMessage.SEVERITY_FATAL, summary, detail ) );
	}

}
