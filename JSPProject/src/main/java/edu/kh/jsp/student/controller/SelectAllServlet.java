package edu.kh.jsp.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.student.model.service.StudentService;
import edu.kh.jsp.student.model.vo.Student;

@WebServlet("/student/selectAll")
public class SelectAllServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		req.setCharacterEncoding("UTF-8");
		
		// 서비스 객체 생성
		String departmentSelect = req.getParameter("departmentSelect");
		
		StudentService service = new StudentService();
		
		try {

			List<Student> stdList = service.selectAll(departmentSelect);
			
			
			req.setAttribute("stdList" , stdList);
				
			RequestDispatcher dispatcherDep = req.getRequestDispatcher("/WEB-INF/views/student/searchDep.jsp");
			
			dispatcherDep.forward(req,resp);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			RequestDispatcher dispatcher 
			= req.getRequestDispatcher("/WEB-INF/views/student/selectAll.jsp");
			
			dispatcher.forward(req,resp);
	
	}
}
