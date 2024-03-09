package io.github.rongaru.common.java.server.faces.utility;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FacesSessionUtility {

	public static Map< String, Object > getSessionParameters( ) {
		FacesContext context = FacesContext.getCurrentInstance( );
		return context.getExternalContext( ).getSessionMap( );
	}

	public static Iterator< FacesMessage > getMessagesIterator( ) {
		FacesContext context = FacesContext.getCurrentInstance( );
		return context.getMessages( );
	}

	public static void saveMessagesToContext( List< FacesMessage > messages ) {
		FacesContext context = FacesContext.getCurrentInstance( );
		messages.forEach( message -> context.addMessage( null, message ) );
	}

}
