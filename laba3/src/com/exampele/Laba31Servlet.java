package com.exampele;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba31Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		double a = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		double b = Integer.parseInt(var2);
		String var3 = req.getParameter("var3");
		double c = Integer.parseInt(var3);
		double d;
		double k1;
		double k2;
		String result;
		d = (b*b)-(4*a*c);
		if (d<0){
			result ="Корней нет";
			resp.getWriter().println(result);
		} else if (d>0){
			k1= (- b + Math.sqrt(d))/(2*a);
			k2= (- b - Math.sqrt(d))/(2*a);
			resp.getWriter().println(k1);
			resp.getWriter().println(k2);
		} else {k1= (- b)/(2*a);
		resp.getWriter().println(k1);
	}
	}
}
