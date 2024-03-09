package io.github.rongaru.common.java.server.faces.listener;

import javax.faces.application.FacesMessage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractMultiPageMessageTransportationPhaseListener extends AbstractPhaseListener {

	protected static final String TOKEN_ID = "MULTI_PAGE_MESSAGE_TRANSPORTATION_PHASE_LISTENER";

	protected abstract Map< String, Object > getSessionParameters( );

	protected abstract Iterator< FacesMessage > getMessagesIterator( );

	protected abstract void saveMessagesToContext( List< FacesMessage > messages );

	protected void saveMessagesToSession( List< FacesMessage > messages ) {
		Map< String, Object > sessionParameters = getSessionParameters( );
		sessionParameters.putIfAbsent( TOKEN_ID, new ArrayList<>( ) );
		Object sessionMessages = sessionParameters.get( TOKEN_ID );
		List< FacesMessage > message = ( List ) sessionMessages;
		message.addAll( messages );
	}

	protected List< FacesMessage > removeMessagesFromContext( ) {
		List< FacesMessage > messages = new ArrayList<>( );
		Iterator< FacesMessage > iterator = getMessagesIterator( );
		while ( iterator.hasNext( ) ) {
			messages.add( iterator.next( ) );
			iterator.remove( );
		}
		return messages;
	}

	protected List< FacesMessage > removeMessageFromSession( ) {
		Map< String, Object > sessionParameters = getSessionParameters( );
		sessionParameters.putIfAbsent( TOKEN_ID, new ArrayList<>( ) );
		return ( List ) sessionParameters.remove( TOKEN_ID );
	}

}
