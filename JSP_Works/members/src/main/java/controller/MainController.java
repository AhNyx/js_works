package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.Board;
import board.BoardDAO;
import member.Member;
import member.MemberDAO;

@WebServlet("*.do")  //��θ� .do�� �������� ����
public class MainController extends HttpServlet {
	
	private static final long serialVersionUID = 4L;
	
	MemberDAO memberDAO;  //MemberDAO ��ü ����
	BoardDAO boardDAO;

	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();  //��ü ����
		boardDAO = new BoardDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ� ���ڵ�
		request.setCharacterEncoding("utf-8");
		
		//�ѱ� ������ ���� ����
		response.setContentType("text/html; charset=utf-8");
		
		//command �������� url �����ϱ�
		String uri = request.getRequestURI();
		System.out.println(uri);
		String command = uri.substring(uri.lastIndexOf('/'));
		System.out.println(uri.lastIndexOf('/'));
		System.out.println("command: " + command);
		
		String nextPage = null;
		
		//��� ��Ʈ�� ��ü ����
		PrintWriter out = response.getWriter();
		
		//���� ��ü ����
		HttpSession session = request.getSession();
		
		if(command.equals("/memberList.do")) { //ȸ�� ��� ��ȸ
			ArrayList<Member> memberList = memberDAO.getMemberList();
			
			//�� ���� �� ������
			request.setAttribute("memberList", memberList);
			nextPage = "/member/memberList.jsp";
		}else if(command.equals("/memberForm.do")) {
			nextPage = "/member/memberForm.jsp";
		}else if(command.equals("/addMember.do")) {
			//���� �Էµ� ������ �ޱ�
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd1");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			Member newMember = new Member();  //ȸ�� ��ü ����
			newMember.setMemberId(memberId);
			newMember.setPasswd(passwd);
			newMember.setName(name);
			newMember.setGender(gender);
			
			memberDAO.addMember(newMember); //ȸ�� �Ű��� DB�� ����
			nextPage = "index.jsp";
		}else if(command.equals("/memberView.do")) { //ȸ�� ���� ��û
			
			//memberId �ޱ�
			String memberId = request.getParameter("memberId");
			
			Member member = memberDAO.getMember(memberId);
			
			request.setAttribute("member", member);  //member �� ����
			
			nextPage = "/member/memberView.jsp";
		} else if(command.equals("/loginForm.do")) { //�α��� ������ ��û
			nextPage = "/member/loginForm.jsp";
		} else if(command.equals("/loginProcess.do")) { //�α��� üũ ��û
			//�α��� ���� �Էµ� ������ �޾ƿ���
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd");
			
			Member loginMember = new Member();
			loginMember.setMemberId(memberId);
			loginMember.setPasswd(passwd);
			
			//�α��� üũ ó��
			boolean result = memberDAO.checkLogin(loginMember);
			if(result) {
				//���� �߱� - ���̵� �߱�
				session.setAttribute("sessionId", memberId);
				nextPage = "/index.jsp";
			}
			else {
				//2���� ��� : alert(), errorMsg ������(��)
				out.println("<script>");
				out.println("alert('���̵�� ��й�ȣ�� Ȯ�����ּ���')");
				out.println("history.go(-1)"); //���� �������� �̵�
				out.println("</script>");
			}
		} else if(command.equals("/logout.do")) {
			//���� ��� ����(����)
			session.invalidate();
			nextPage = "/index.jsp";
		}	else if(command.equals("/deleteMember.do")) {
			String memberId = request.getParameter("memberId");
			memberDAO.deleteMember(memberId);
			nextPage = "/memberList.do";	
		} else if(command.equals("/updateBoard.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum);
			
			request.setAttribute("board", board);
			
			nextPage = "/board/updateBoard.jsp";
		} else if(command.equals("/updateProcess.do")) {
			//���� ������ �Է� ���� �ޱ�
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
						
			Board updateBoard = new Board();
			updateBoard.setTitle(title);
			updateBoard.setContent(content);
			updateBoard.setBnum(bnum);
			boardDAO.updateBoard(updateBoard);
			
			nextPage = "/boardList.do";
		}
		
		//�Խ��� ����
		if(command.equals("/boardList.do")) {
			ArrayList<Board> boardList = boardDAO.getBoardList();
			//�� ����
			request.setAttribute("boardList", boardList);
			nextPage = "/board/boardList.jsp";
		}else if(command.equals("/boardForm.do")) {
			nextPage = "/board/boardForm.jsp";
		}else if(command.equals("/addBoard.do")) {
			//�۾��� ���� �Էµ� ������ �޾ƿ���
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			//memberId ������ ��������
			String memberId = (String)session.getAttribute("sessionId");
			
			Board board = new Board();
			board.setTitle(title);
			board.setContent(content);
			board.setMemberId(memberId);
			
			//�۾��� ó�� �޼��� ȣ��
			boardDAO.addBoard(board);
		}else if(command.equals("/boardView.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum);  //�� �󼼺��� ó��
			
			//�� ����
			request.setAttribute("board", board);
			
			nextPage = "/board/boardView.jsp";
		} else if(command.equals("/memberEvent.do")) {
			
			
			nextPage = "/member/memberEvent.jsp";
		}
		
		
		
		
		//������ - ���ΰ�ħ �ڵ� ���� ���� �ذ� : response.sendRedirect()
		if(command.equals("/addBoard.do")) {
			response.sendRedirect("/boardList.do");
		}
		else {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher(nextPage);
			
			dispatcher.forward(request, response);
		}
	}

}