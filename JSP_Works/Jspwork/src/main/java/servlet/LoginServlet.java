package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ� ���ڵ�(���� �Էµ� �ѱ� ó��)
		request.setCharacterEncoding("utf-8");
		//jsp ���� �Էµ� �ڷ� ����
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		System.out.println("���̵�: " + userid);
		System.out.println("��й�ȣ: " + passwd);
	}

}
