package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.vo.Person;

@WebServlet("/forEach")
public class ForEachServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Person> pList = new ArrayList<>();
		
		pList.add(new Person("홍길동",25,"서울시 중구"));
		pList.add(new Person("동길동",15,"서울시 쌍문동"));
		pList.add(new Person("무무동",44,"서울시 광진구"));
		pList.add(new Person("베레캬",233,"서울시 노원구"));
		pList.add(new Person("캬캬오",11,"서울시 강남구"));
		
		req.setAttribute("pList",pList);
		
		// 요청 위임
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/forEach.jsp");
		
		dispatcher.forward(req, resp);
			
	}

}
