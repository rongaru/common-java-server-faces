package io.github.rongaru.common.java.server.faces.utility;

public class FacesScreenUtility {

	public static String redirect( String screen ) {
		return screen + "?faces-redirect=true";
	}

}
