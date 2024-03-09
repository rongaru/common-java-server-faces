package io.github.rongaru.common.java.server.faces.listener;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public abstract class AbstractDirectAccessRequestPhaseListenerBeanJSF extends AbstractPhaseListener {

	@Override
	public void afterPhase( PhaseEvent phaseEvent ) {
		//To Do Implementation
	}

	@Override
	public void beforePhase( PhaseEvent phaseEvent ) {
		PhaseId phaseId = phaseEvent.getPhaseId( );
		if ( PhaseId.RESTORE_VIEW.equals( phaseId ) ) {
			FacesContext context = phaseEvent.getFacesContext( );
			ExternalContext external = context.getExternalContext( );
			boolean isValid = performAccessRequestValidation( external );
		}
	}

	protected abstract boolean performAccessRequestValidation( ExternalContext externalContext );

}
