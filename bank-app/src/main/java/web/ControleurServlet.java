package web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import controllers.ProductsController;

public class ControleurServlet extends HttpServlet {
	
	private String pathViews;
	
	private Controller controller;
	
	@Override
	public void init() throws ServletException {
			pathViews=getInitParameter("pathViews");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();
		String action=path.substring(1,path.indexOf(".do"));
		String controllerName=action.split("/")[0];
		String operationName=action.split("/")[1];
		try {
			
			Class c = Class.forName("controllers."+controllerName+"Controller");
			controller=(Controller) c .newInstance();
			
			Method method=c.getMethod(operationName, HttpServletRequest.class,HttpServletResponse.class);
			Object resultat = method.invoke(controller, request, response);
			if( resultat instanceof String) {
				request.getRequestDispatcher("/"+pathViews+"/"+resultat).forward(request, response);
				
			} else {
				ObjectMapper mapper = new ObjectMapper();
				response.setContentType("application/json");
				mapper.writeValue(response.getOutputStream(), resultat);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
	}

	
}

