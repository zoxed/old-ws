package controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.Controller;

public class ClientsController extends Controller {
	
	public Object index(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Client view");
		Map<String,Object> data = new HashMap<String, Object> ();
		data.put("name", "mohamed kaabi");
		data.put("email", "simon.kaabi@gmail.com");
		data.put("telephone","+212 6 14 82 90 08");
		data.put("age", 26);
		return data;
	}
	
	public Object liste(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Client view");
		Map<String,Object> data = new HashMap<String, Object> ();
		
		data.put("ID", 1);
		data.put("Client", "simon");
		data.put("telephone", "mok");
		data.put("contact", 12066666);
		return data;
	}

	
}
