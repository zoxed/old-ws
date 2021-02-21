package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="cs" , urlPatterns = {"/hello","*.do"})
public class ControleurServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name = request.getParameter("name");
		request.setAttribute("model", name);
//		request.getRequestDispatcher("view.jsp").forward(request, response);
		response.sendRedirect("view.jsp?name="+name);
	}
	
}
