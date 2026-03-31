package functionalinterfaces.markerinterfaces.cloningprototypeobjects;

public class Student implements Cloneable{
	
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void display() {
		System.out.println(name +":"+ age);
	}
	
}
