package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.Member;
import member.MemberDAO;

@WebServlet("*.do") // ��θ� .do�� �������� ����
public class MainController extends HttpServlet {
	
	private static final long serialVersionUID = 4L;

	MemberDAO memberDAO; // dao ��ü ����
	
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO(); // ��ü ����
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		//command �������� url �����ϱ�
		String uri = request.getRequestURI();
		System.out.println(uri);
		String command = uri.substring(uri.lastIndexOf('/'));
		System.out.println(uri.lastIndexOf('/'));
		System.out.println("command: " + command);
		
		String nextPage = null;
		//ȸ�� ��� ��ȸ
		if(command.equals("/memberList.do")) {
			
			ArrayList<Member> memberList = memberDAO.getMemberList();
			
			//��
			request.setAttribute("memberList", memberList);
			
			nextPage = "memberList.jsp";
		} else if(command.equals("/memberForm.do")) {
			nextPage = "memberForm.jsp";
		} else if(command.equals("/addMember.do")) {
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd1");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			Member newMember = new Member();
			newMember.setMemberId(memberId);
			newMember.setPasswd(passwd);
			newMember.setName(name);
			newMember.setGender(gender);
			
			memberDAO.addMember(newMember);
			
			nextPage = "index.jsp";
		}
		
		//������
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		
		dispatcher.forward(request, response);
	}

}
