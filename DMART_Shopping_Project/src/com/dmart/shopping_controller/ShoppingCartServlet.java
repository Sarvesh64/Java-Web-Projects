package com.dmart.shopping_controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dmart.dao.DaoProductImpl;
import com.dmart.dao.IdaoProduct;

/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("*.do")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String jspName= "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String command=request.getServletPath();
		System.out.println(command);
		
		switch(command) {
		case "/GetAllUserDetails.do":{
			response.getWriter().println("Routing Working!");
			
			IdaoProduct service =new DaoProductImpl();
			try {
				service.getAllProductDetails();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		default:
			response.getWriter().println("Default Case");
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
