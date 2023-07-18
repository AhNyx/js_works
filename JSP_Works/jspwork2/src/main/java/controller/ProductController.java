package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.Product;
import product.ProductService;

@WebServlet("/pcontrol")
public class ProductController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private ProductService service;
	
	@Override
	public void init(){
		service = new ProductService();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String nextPage = null;
		
		if(action.equals("list")) {
			
			List<Product> productList = service.getProductList();
			
			request.setAttribute("productList", productList);
			
			nextPage = "/product/productList.jsp";
		} else if(action.equals("info")) {
			String pid = request.getParameter("pid");
			Product product = service.getProduct(pid);
			request.setAttribute("product", product);
			nextPage = "/product/productInfo.jsp";
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}
	
	
}

