package functionalinterfaces.markerinterfaces.sensitivedatatagging;

public class Main {
	public static void main(String[] args) {
		ImportantDocuments id= new ImportantDocuments("Important details");
		
		if(id instanceof Sensitive) {
			System.out.println("Encrypted");
		}
		else {
			System.out.println(id.details);
		}
	}
}
