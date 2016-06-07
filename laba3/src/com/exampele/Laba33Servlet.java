package com.exampele;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba33Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		int [][] mas = new int[8][5];
		int max;
		byte i,j;
		resp.getWriter().println("<html><body><br></body></html>");
		for (i=0;i<8; i++){
			for (j=0;j<5; j++){ mas[i][j]= (int)(Math.random()*198)-99;
			resp.getWriter().println(mas[i][j]+" ");
			}
			resp.getWriter().println("<html><body><br></body></html>");
		}
		max=-100;
		for (i=0;i<8; i++){
			for (j=0;j<5; j++){ if (mas[i][j] > max)
				{max= mas [i][j];}
			}
		}
		resp.getWriter().println("<html><body><br></body></html>");
		resp.getWriter().println("Максимальное число: "+max);
	
	}
}
