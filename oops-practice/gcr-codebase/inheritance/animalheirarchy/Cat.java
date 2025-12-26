package animalhierarchy;

public class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println(name +" is meow");
		System.out.println(name +" "+ age +" years old");
	}
}