package edu.kh.community.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import edu.kh.community.member.model.service.MemberService;
import edu.kh.community.member.model.vo.Member;

@WebServlet("/member/selectOne")
public class SelectOneServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 파라미터 얻어오기 
		String memberEmail = req.getParameter("in1");
		
		try {
			MemberService service = new MemberService();
			
			// 회원 정보 조회 Service 호출 후 결과(Member객체) 반환 받기 
			Member member = service.selectOne(memberEmail);
			
			// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			// 조회 결과를 응답용 스트림으로 출력
			
			// * java 객체를 javaScript 객체로 변환하여 응답(출력) * 
			// Java 객체 => JavaScript 객체 형태의 문자열(JSON) => JavaScript 객체
			// 1) JSON 직접 작성 => 오타위험
			// 2) JSON-simple 라이브러리
			// 3) GSON 라이브러리를 이용한 JAVA객체 => JSON 변환
			// new Gson().toJson(객체, 응답 스트림);
			// => 매개변수에 작성된 객체를 JSON 형태로 변환한 후 스트림을 통해서 출력
			
			new Gson().toJson(member,resp.getWriter());
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
