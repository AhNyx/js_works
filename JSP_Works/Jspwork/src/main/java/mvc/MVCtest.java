package mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVC
 */
@WebServlet("/mvc/mvc01")
public class MVCtest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVCtest() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String season = "����";
		
		String[] seasons = {"��","����","����","�ܿ�"};
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		//�� �����ؼ� view�� ����
		request.setAttribute("season", season);
		request.setAttribute("seasons", seasons);
		request.setAttribute("numberList", numberList);
		
		//������
		RequestDispatcher dispatcher = request.getRequestDispatcher("/mvc/mvc01.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
