package io.github.rongaru.common.java.server.faces.utility;

import javax.faces.context.FacesContext;

public class FacesManagedBeanUtility {

	public static < T > T removeSessionManagedBean( Class< T > element ) {
		String identifier = getManagedBeanIdentifier( element );
		return ( T ) removeSessionManagedBean( identifier );
	}

	public static < T > T createSessionManagedBean( Class< T > element ) {
		String identifier = getManagedBeanIdentifier( element );
		return ( T ) createSessionManagedBean( identifier );
	}

	public static Object removeSessionManagedBean( String element ) {
		return FacesSessionUtility.getSessionParameters( ).remove( element );
	}

	public static Object createSessionManagedBean( String element ) {
		String identifier = "#{" + element + "}";
		FacesContext context = FacesContext.getCurrentInstance( );
		return context.getApplication( ).createValueBinding( identifier ).getValue( context );
	}

	protected static < T > String getManagedBeanIdentifier( Class< T > element ) {
		String className = element.getSimpleName( );
		char c = Character.toLowerCase( className.charAt( 0 ) );
		StringBuilder identifierBuilder = new StringBuilder( "" + c );
		className.chars( ).skip( 1 ).forEach( identifierBuilder::append );
		return identifierBuilder.toString( );
	}

}
