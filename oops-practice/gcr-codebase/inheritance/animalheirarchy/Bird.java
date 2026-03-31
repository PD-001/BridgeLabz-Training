package animalhierarchy;

public class Bird extends Animal {
	@Override
	public void makeSound() {
		System.out.println(name +" is tweet");
		System.out.println(name +" "+ age +" years old");
	}
}