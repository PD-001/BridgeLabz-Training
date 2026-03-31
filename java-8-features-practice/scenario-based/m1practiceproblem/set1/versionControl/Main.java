package m1practiceproblem.set1.versionControl;

import java.util.*;

class Version{
	
	String version;
	double size;
	
	public Version(String version, double size) {
		this.version= version;
		this.size= size;
	}
	
	public double getSize() {
		return size;
	}
}

public class Main {

	
	static HashMap<String, ArrayList<Version>> git= new HashMap<>();
	
	public static void uploadFile(String fileName, String ver, double size) {
		
		if(!git.containsKey(fileName)) {
			Version v= new Version(ver, size);
			
			ArrayList<Version> l=new ArrayList<>();
			l.add(v);
			
			git.put(fileName, l);
			return;
		}
		
		boolean present=false;
		
		for(String f: git.keySet()) {
			if(f.equalsIgnoreCase(fileName)) {
				present= git.get(f).stream()
					.anyMatch((Version v)->v.version.equalsIgnoreCase(ver));
			}
		}
		if(present) return;
		
		Version v= new Version(ver, size);
		
		ArrayList<Version> l= git.get(fileName);
		l.add(v);
		git.put(fileName, l);
		
	}
	
	public static void fetchFile(String fileName) {
		
		if(!git.containsKey(fileName)) {
			System.out.println("File Not Found");
			return;
		}
		
		for(String f: git.keySet()) {
			if(f.equalsIgnoreCase(fileName)) {
				
				git.get(f).stream()
					.sorted(Comparator.comparing((Version v)->v.size).thenComparing(v->v.version))
					.forEach(v->System.out.println(f+" "+v.version+" "+v.size));
				
			}
		}
		
	}
	
	public static void latestFile(String fileName) {
		
		if(!git.containsKey(fileName)) {
			System.out.println("File Not Found");
			return;
		}
		
		ArrayList<Version> l= git.get(fileName);

		System.out.println(fileName+" "+ l.get(l.size()-1).version +" "+ l.get(l.size()-1).size);
		
	}
	
	public static void totalStorage(String fileName) {
		
		if(!git.containsKey(fileName)) {
			System.out.println("File Not Found");
			return;
		}
		
		ArrayList<Version> l= git.get(fileName);
		
		double totalSize=0;
		
		for(Version v: l) {
			totalSize+=v.size;
		}
		
		System.out.println(fileName+" "+totalSize);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		
		while(n-->0) {
			
			String[] strArray= sc.nextLine().split("\\s");
			
			if(strArray[0].equalsIgnoreCase("upload")) {
				uploadFile(strArray[1], strArray[2], Double.parseDouble(strArray[3]) );
			}
			else if(strArray[0].equalsIgnoreCase("fetch")) {
				fetchFile(strArray[1]);
			}
			else if(strArray[0].equalsIgnoreCase("latest")) {
				latestFile(strArray[1]);
			}
			else {
				totalStorage(strArray[1]);
			}
		}
		
	}
	
}
