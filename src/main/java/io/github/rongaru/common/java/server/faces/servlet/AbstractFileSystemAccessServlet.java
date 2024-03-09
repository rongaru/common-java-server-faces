package io.github.rongaru.common.java.server.faces.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractFileSystemAccessServlet extends HttpServlet {

	@Override
	public String getServletInfo( ) {
		return "This Servlet Allows To Access Files From File System.";
	}

	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) {
		writeFileIntoResponseOutputStream( request, response );
	}

	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) {
		response.setContentType( "text/html;charset=UTF-8" );
		writeFileIntoResponseOutputStream( request, response );
	}

	protected abstract void writeFileIntoResponseOutputStream( HttpServletRequest request, HttpServletResponse response );

}
