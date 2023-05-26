package abstractex.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		animalSound(dog);
		animalSound(cat);
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}
