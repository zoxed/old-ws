package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.Controller;

public class ProductsController extends Controller {

	public Object List (HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("************************");
		System.out.println("product controleur");
		return ("index.jsp");
		//request.getRequestDispatcher("views/index.jsp").forward(request, response);
		
		
	}
	
	

}
