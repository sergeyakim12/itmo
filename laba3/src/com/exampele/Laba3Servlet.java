package com.exampele;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		double i1 = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		double i2 = Integer.parseInt(var2);
		double raz1;
		double raz2;
		String result;
		raz1 = Math.abs(10 - i1);
		raz2 = Math.abs(10 - i2);
		if (raz1<raz2){
			result ="Первое число ближе";
		} else if (raz1>raz2){
			result ="Второе число ближе";
		} else {result ="Оба числа на одинаковом расстоянии";
	}resp.getWriter().println(result);
	}
}
