package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AuthenFilter �ʱ�ȭ...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		// ���͸� ����Ͽ� �ѱ� ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		// ������ ���� ���(�ؽ�Ʈ�� html�� ���)
		response.setContentType("text/html; charset=utf-8");
		
		//���͸� ����Ͽ� �Է°� ���� ����ϱ�
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		
		if(username == "" || username.equals("")) {
			out.println("�̸��� �Է����� �ʾҽ��ϴ�.");
			return;  //�ٷ� ����
		}
	
		chain.doFilter(request, response); //���� ó��
	}
	
	@Override
	public void destroy() {
		System.out.println("AuthenFilter ����...");
	}

}