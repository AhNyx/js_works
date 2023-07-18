package product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		Product p1 = new Product("p-11", "Galaxy21", "�Ｚ����",1000000,"2023-03-16");
		Product p2 = new Product("p-12", "LG �׷�", "LG����",1500000,"2023-04-16");
		
		products.put("p-11", p1);
		products.put("p-12", p2);
	}
	//��ǰ ��� ����
	public List<Product> getProductList(){
		return new ArrayList<>(products.values());
	}
	
	public Product getProduct(String pid) {
		return products.get(pid);
	}
}
