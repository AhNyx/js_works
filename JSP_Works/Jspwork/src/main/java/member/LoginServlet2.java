package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/login")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ� ���ڵ�(���� �Էµ� �ѱ� ó��)
		request.setCharacterEncoding("utf-8");
		
		//���� ������ ����
		response.setContentType("text/html; charset=utf-8");
		//jsp ���� �Էµ� �ڷ� ����
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		
		PrintWriter out = response.getWriter();
		
		String data = "<html><body>";
		data += "<p>���̵�: " + userid + "</p>";
		data += "<p>��й�ȣ: " + passwd + "</p>";
		data += "<p>��ȭ��ȣ: " + phone + "</p>";		
		data += "</body></html>";
		out.println(data);
		
//		System.out.println("���̵�: " + userid);
//		System.out.println("��й�ȣ: " + passwd);
		
	}

}
