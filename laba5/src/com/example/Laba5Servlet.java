package com.example;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.util.ArrayList;
import objects.*;
@SuppressWarnings("serial")
public class Laba5Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("Content-Type: text/html; charset=UTF-8");
		
	try {
		Builder builder = new Builder();
	
		String type = req.getParameter("type");
		
		String result = "";
	
		if (type.equals("expoHalls")) {
			ArrayList<ExpoHalls> expoHalls = builder.buildExpoHalls(); 
			
			for (ExpoHalls exp : expoHalls) {     
				result += "<tr>";
				result += "<td>" + exp.name + "</td>";
				result += "<td>" + exp.address + "</td>";
				result += "<td>" + exp.area + "</td>";
				result += "<td>" + exp.phone + "</td>";
				result += "<td>" + exp.mail + "</td>";
				result += "</tr>";
			}
		} else if (type.equals("organization")) {
			ArrayList<Organisation> organisation = builder.buildOrganisation();
			
			for (Organisation org : organisation) {
				result += "<tr>";
				result += "<td>" + org.name + "</td>";
				result += "<td>" + org.address + "</td>";
				result += "<td>" + org.head + "</td>";
				result += "<td>" + org.phone + "</td>";
				result += "<td>" + org.mail + "</td>";
				result += "</tr>";
			}
		}
		
		resp.getWriter().println(result);
		
	} catch (IllegalAccessException | InstantiationException ex) {
        throw new ServletException(ex);
    }
}
}
