package lambdaexpressions.hospitalpatientidprinting;

public class Patient {
	
	int id;
	String name;
	
	Patient(int id, String name){
		this.id= id;
		this.name= name;
	}
	
	public int getid() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Id:"+ this.id +"\nName:"+ this.name + "\n";
	}
}
