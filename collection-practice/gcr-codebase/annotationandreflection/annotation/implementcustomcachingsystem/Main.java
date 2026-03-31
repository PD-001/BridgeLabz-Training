package annotationandreflection.annotation.implementcustomcachingsystem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	static HashMap<Integer,Integer> hm= new HashMap<>();
	
	@CacheResult
	public static int output(int inp) {
		System.out.println("Computing value");
		return inp*10;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			
			Method m= Main.class.getDeclaredMethod("output", int.class);
			
			if(m.isAnnotationPresent(CacheResult.class)) {
				
				for(int i=0;i<3;i++) {
					
					int n= sc.nextInt();
					
					if(hm.containsKey(n))
						System.out.println("From cache: "+hm.get(n));
					
					else {
						int result= (int)m.invoke(null, n);
						hm.put(n, result);
						System.out.println("From method: "+result);
					}
				}
			}
			
		} catch(NoSuchMethodException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		} catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
