package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFileFilter implements Filter{

	PrintWriter writer;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//�α� ���� ����
		String filename = filterConfig.getInitParameter("filename");
		if(filename == null) {
			throw new ServletException("�α� ������ �̸��� ã�� �� �����ϴ�."); //������ ���� �߻�
		}
		
		try {
			writer = new PrintWriter(new FileWriter(filename, true), true);
		} catch (IOException e) {
			throw new ServletException("�α� ������ �� �� �����ϴ�.");
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//�α� ���Ͽ� ����� ����
		String clientAddr = request.getRemoteAddr();  //IP �ּ�
		writer.printf("Ŭ���̾�Ʈ IP �ּ�: %s %n", clientAddr);
		
		String contentType = response.getContentType(); //������ ����
		writer.printf("������ ������ ����: %s %n", contentType);
		
		writer.printf("���� �Ͻ�: %s %n", getCurrentTime()); //���� ��¥�� �ð�
		
		chain.doFilter(request, response); //���� ó��
	}
	
	@Override
	public void destroy() {
		writer.close();
	}
	
	//���� ��¥�� �ð��� �������� �޼���
	private String getCurrentTime() {
		LocalDateTime now = LocalDateTime.now(); //��¥ ��ü ����
		
		DateTimeFormatter datetime = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		return now.format(datetime);
	}
}