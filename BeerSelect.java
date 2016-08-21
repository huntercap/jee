package com.example.web;


//import com.example.model.*;//new add ,part 2
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BeerSelect
 */

public class BeerSelect extends HttpServlet {       

	public void doPost(HttpServletRequest request, 
					HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		
		BeerExpert be = new BeerExpert();//new add ,part 2
		List result = be.getBrands(c);//new add ,part 2
		
		
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		
		Iterator it = result.iterator();//new add ,part 2
		while(it.hasNext()){
			out.println("<br>try: " + it.next());//new add ,part 2
		}
		
		String c = request.getParameter("color");
		out.println("<br>Got beer color " + c);

	}
	
	//This is the mothe for lunch dirct.
	//This is trd modfi
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().println("servlet at :" + request.getParameter("color"));
	}

}
