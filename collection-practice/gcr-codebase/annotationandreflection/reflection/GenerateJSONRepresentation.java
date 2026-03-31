package annotationandreflection.reflection;

import java.lang.reflect.Field;

public class GenerateJSONRepresentation {
	String name="Prakash";
	int age=21;
	
	public static void main(String[] args) {
		GenerateJSONRepresentation obj= new GenerateJSONRepresentation();
		Class<?> cls= obj.getClass();
		Field[] fields= cls.getDeclaredFields();
		System.out.print("{");
		for(int i=0;i<fields.length-1;i++) {
			fields[i].setAccessible(true);
			try {
//				System.out.println();
				if(fields[i].get(obj) instanceof String) {
					System.out.print("\""+ fields[i].getName() +"\": \""+ fields[i].get(obj)+ "\", ");
				}
				else{
					System.out.print("\""+ fields[i].getName() +"\": "+ fields[i].get(obj)+ ", ");
				}
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
		try {
			
			if(fields[fields.length-1].get(obj) instanceof String) {
				System.out.print("\""+ fields[(fields.length)-1].getName() +"\": \""+ fields[(fields.length)-1].get(obj) + "\"}");
			}
			else{
				System.out.print("\""+ fields[(fields.length)-1].getName() +"\": "+ fields[(fields.length)-1].get(obj) + "}");
			}
			
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
