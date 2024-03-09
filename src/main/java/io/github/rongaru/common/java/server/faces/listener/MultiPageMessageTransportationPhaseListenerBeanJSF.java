package io.github.rongaru.common.java.server.faces.listener;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.github.rongaru.common.java.server.faces.utility.FacesSessionUtility;

@ManagedBean
@ApplicationScoped
public class MultiPageMessageTransportationPhaseListenerBeanJSF extends AbstractMultiPageMessageTransportationPhaseListener {

	@Override
	public void afterPhase( PhaseEvent phaseEvent ) {
		replaceMessageContainer( phaseEvent );
	}

	@Override
	public void beforePhase( PhaseEvent phaseEvent ) {
		replaceMessageContainer( phaseEvent );
	}

	@Override
	protected Map< String, Object > getSessionParameters( ) {
		return FacesSessionUtility.getSessionParameters( );
	}

	@Override
	protected Iterator< FacesMessage > getMessagesIterator( ) {
		return FacesSessionUtility.getMessagesIterator( );
	}

	@Override
	protected void saveMessagesToContext( List< FacesMessage > messages ) {
		FacesSessionUtility.saveMessagesToContext( messages );
	}

	protected void replaceMessageContainer( PhaseEvent phaseEvent ) {
		PhaseId phaseId = phaseEvent.getPhaseId( );
		if ( PhaseId.RENDER_RESPONSE.equals( phaseId ) ) {
			saveMessagesToContext( removeMessageFromSession( ) );
		} else {
			saveMessagesToSession( removeMessagesFromContext( ) );
		}
	}

}
