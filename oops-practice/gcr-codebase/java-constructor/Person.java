
public class Person {

	//attributes
	String name;
	int age;

	//parameterized constructor
	Person(String name, int age) {
		this.name= name;
		this.age= age;
	}

	//copy constructor
	Person(Person otherPerson) {
		this.name= otherPerson.name;
		this.age= otherPerson.age;
	}

	//method to display person details
	public void displayPerson() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}

	public static void main(String[] args) {

		//creating original object
		Person person1= new Person("Arjun", 25);
		person1.displayPerson();

		System.out.println();

		//creating cloned object using copy constructor
		Person person2= new Person(person1);
		person2.displayPerson();
	}
}
