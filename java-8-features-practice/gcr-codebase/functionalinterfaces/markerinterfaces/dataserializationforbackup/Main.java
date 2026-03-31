package functionalinterfaces.markerinterfaces.dataserializationforbackup;

public class Main {
	public static void main(String[] args) {
		Backup.backup(new Student("Prakash", 21));
		Backup.backup(new Employee("Pushpak"));
		
	}
}
