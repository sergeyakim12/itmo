package com.exampele;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba32Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		int [][] mas = new int[5][8];
		byte i,j;
		resp.getWriter().println("<html><body><br></body></html>");
		for (i=0;i<5; i++){
			for (j=0;j<8; j++){ mas[i][j]= (int)(Math.random()*90)+10;
			resp.getWriter().println(mas[i][j]+" ");
			}
			resp.getWriter().println("<html><body><br></body></html>");
		}
		
	
	}
}
