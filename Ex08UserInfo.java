package com.smhrd.servlet1231;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex08UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		String food = request.getParameter("food");
		
		// checkbox 타입의 값을 접근할 때 아래 메소드 활용!
		// or name 속성 값이 동일한 여러 개의 입력값을 접근할 때
		// 문자열배열로 반환!
		String[] foods = request.getParameterValues("food");
		System.out.println(Arrays.toString(foods));

	}

}
