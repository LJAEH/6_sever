package edu.kh.community.member.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.community.member.model.service.MemberService;

@WebServlet("/member/CheckNumber")
public class CheckNumberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inputcNumber = req.getParameter("inputcNumber");
		String inputEmail = req.getParameter("inputEmail");
		
		try {
			String pNumber = new MemberService().checkNumberService(inputEmail);
			
			if (inputcNumber == pNumber) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	
	}
}
