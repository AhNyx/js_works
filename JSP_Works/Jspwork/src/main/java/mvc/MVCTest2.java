package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MVCTest2 extends HttpServlet{

	private static final long serialVersionUID = 20L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//¦��,Ȧ�� �����ؼ� ����� jsp�� ������
		
		
		int num = 0;
		if(request.getParameter("num") != null) {
			num = Integer.parseInt(request.getParameter("num"));
		}
		
		String result = "";
		if(num % 2 == 0) {
			result = "¦���Դϴ�.";
		} else {
			result = "Ȧ���Դϴ�.";
		}
		
		
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/mvc/mvc02.jsp");
		
		dispatcher.forward(request, response);
	}
	
	
}
