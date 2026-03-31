package annotationandreflection.annotation;

class Animal {
	public void makeSound() {
		System.out.println("makes sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("barks");
	}
}

public class UseOverrideCorrectly {
	public static void main(String[] args) {
		Dog dog= new Dog();
		dog.makeSound();
	}
}
