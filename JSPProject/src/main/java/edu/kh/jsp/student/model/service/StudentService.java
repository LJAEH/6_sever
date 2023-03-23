package edu.kh.jsp.student.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.jsp.common.JDBCTemplate.*;
import edu.kh.jsp.student.model.dao.StudentDAO;
import edu.kh.jsp.student.model.vo.Student;

public class StudentService {
	
	private StudentDAO dao = new StudentDAO();

	public List<Student> selectAll(String departmentSelect) throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectAll(conn, departmentSelect);
		
		// 트랙잭션 처리(DML인 경우에만 진행)
		
		// Connection 객체 반환
		close(conn);
	
		return stdList;
	}


}
