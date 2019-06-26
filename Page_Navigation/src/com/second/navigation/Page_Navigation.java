package com.second.navigation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page_Navigation
 */
@WebServlet({"*.do"})
public class Page_Navigation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page_Navigation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String command =(request.getServletPath());
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String loca="";
		
		if(uname.equals("sarvesh") & pwd.equals("sarvesh")) {
			//response.getWriter().println("Username " + uname+"<br>"+"Password " +pwd+"<br>");
			response.getWriter().println("Login Successfull...");
			loca="/welcome.html";
		}
		else {
			response.getWriter().println("Login Failed...");
			loca="/Failed.html";
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
