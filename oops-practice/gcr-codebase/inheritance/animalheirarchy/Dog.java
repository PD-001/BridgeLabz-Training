package animalhierarchy;

public class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println(name +" is barking");
		System.out.println(name +" "+ age +" years old");
	}
}