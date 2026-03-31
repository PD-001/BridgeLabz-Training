package functionalinterfaces.markerinterfaces.dataserializationforbackup;

import java.io.Serializable;

public class Backup {
	
	public static void backup(Object obj) {
		if(obj instanceof Serializable) {
			System.out.println("Serializable: "+ obj.getClass().getSimpleName());
		}
		else {
			System.out.println("Not serializale");
		}
	}
	
}
