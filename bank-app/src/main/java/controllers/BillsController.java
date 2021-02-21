package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.Controller;

public class BillsController extends Controller {

	public Object unlist(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("Bills view");
		return "bills.jsp";
	}

}
