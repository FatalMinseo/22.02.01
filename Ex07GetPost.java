package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07GetPost")
public class Ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
// Post 방식일 때 한글깨짐방지
		// 데이터를 request객체로부터 가져오기 전에 설정!!!
		req.setCharacterEncoding("UTF-8");
		System.out.println("요청이 들어옴..!");
		
		
		
		
//		resp.setContentType("text/html; charset=utf-8");
//		PrintWriter out = resp.getWriter();
		
		// 사용자가 입력한 ID와 PW를 변수에 저장한 후 콘솔창에 출력해보기
		String id = req.getParameter("user-id");
		String pw = req.getParameter("user-pw");
		
		System.out.println(id+" / "+pw);
		
	}
	
//	// Get 방식일 때
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("Get 방식으로 실행...!");
//
//	}
//	// Post 방식일 떄
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("Post 방식으로 실행...!");
//	}

}
