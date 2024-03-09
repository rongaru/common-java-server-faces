package io.github.rongaru.common.java.server.faces.listener;

import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public abstract class AbstractPhaseListener implements PhaseListener {

	@Override
	public PhaseId getPhaseId( ) {
		return PhaseId.ANY_PHASE;
	}

}
