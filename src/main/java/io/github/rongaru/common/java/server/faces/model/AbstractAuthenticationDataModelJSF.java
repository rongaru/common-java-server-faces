package io.github.rongaru.common.java.server.faces.model;

public abstract class AbstractAuthenticationDataModelJSF< UserDto > {

	protected UserDto userDto;

	public UserDto getUserDto( ) {
		return userDto;
	}

	public void setUserDto( UserDto userDto ) {
		this.userDto = userDto;
	}

}
