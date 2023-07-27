package basic_p;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		
		
		try {	
				
			for(int i=0;i<args.length;i++) {				
				try {
					list.add(Integer.parseInt(args[i]));
					System.out.println("넣기");
					
				} catch (Exception e) {
					System.out.println("@@");
				}
			}
			
			
			for(int i : list) {
				if(i % 2 != 0) {
					sum += i;
					count++;
				}
				
			}
			System.out.println("합계 :" + sum);
			System.out.println("평균 : " + (sum / count));
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	}
}
