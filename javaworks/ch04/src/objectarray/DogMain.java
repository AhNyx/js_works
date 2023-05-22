package objectarray;

public class DogMain {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[3];
				
		for(int i=0;i<dogArray.length;i++) {
			dogArray[i] = new Dog();
		}
		
		dogArray[0].setDogName("백구");
		dogArray[0].setType("진돗개");
		
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getType());
	}

}
