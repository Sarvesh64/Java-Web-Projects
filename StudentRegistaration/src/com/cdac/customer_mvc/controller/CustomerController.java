package com.cdac.customer_mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import com.cdac.customer_mvc.dao.CustomerDao;
import com.cdac.customer_mvc.dao.ICustomerDao;
import com.cdac.customer_mvc.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RequestDispatcher = null;
       
	private List<Customer> customerList= new ArrayList<Customer>();;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1 & 2: fetch request params
		
		//step 2 : create customer object and store request parameter in it
		Customer  customer = new Customer();
		customer.setFirstName(request.getParameter("firstName"));
		customer.setLastName(request.getParameter("lastName"));
		customer.setMobileNo(request.getParameter("mobileNo"));
		customer.setEmail(request.getParameter("email"));
		
		
		//create the list and add the costomer to the list 
		//customerList = new ArrayList<Customer>();
		customerList.add(customer);
		
		// make available at the sessionScope 
		HttpSession session = request.getSession();
		session.setAttribute("customerList", customerList);
		//step 3 : call service to add the customer
		
		//step 4 : once the customer added now add it to the 
		//requestScope and forward to the jsp Page to 
		//show the added customer record 
		
		request.setAttribute("customer", customer);
		
		
		//step 5 
		
		RequestDispatcher rd =null;
		
		//rd=request.getRequestDispatcher("AddCustomerSuccess.jsp");
		rd=request.getRequestDispatcher("CustomerList.jsp");
		rd.forward(request, response);
		//ICustomerDao service = new CustomerDao();
		
		//service.insertCustomer(customer);
		
		//doGet(request, response);
	}

}
