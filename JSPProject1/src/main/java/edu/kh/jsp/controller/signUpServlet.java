package edu.kh.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signUp")
public class signUpServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");
		
		String[] hobby = req.getParameterValues("hobby");

		String result = "";
		
		for(int i = 0; i<hobby.length; i++) {
			
			if (hobby[i] != null) {
				result += hobby[i]+" ";
			}
		}
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/signUpResult.jsp");
		
		req.setAttribute("%s", result);
		
		dispatcher.forward(req,resp);
	}

}
