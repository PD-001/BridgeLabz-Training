package csvdatahandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class Student {
	int id;
	String name;
	int age;
	int marks;
	
	Student(int id, String name, int age,int marks){
		this.id= id;
		this.name= name;
		this.age= age;
		this.marks= marks;
	}
	
	@Override
	public String toString() {
		return "ID:"+ this.id +"\nName:"+ this.name +"\nAge:"+ this.age +"\nMarks:"+ this.marks;
	}
}
public class ConvertCSVDataToObjects {
	public static void main(String[] args) {
		String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\csvdatahandling\\studentdetails.csv";
		List<Student> list= new LinkedList<>();
		try (
				BufferedReader br= new BufferedReader(new FileReader(source))
			){
			String line;
			br.readLine();
			while((line= br.readLine())!=null) {
				String[] coulumn= line.split(",");
				list.add(new Student(Integer.parseInt(coulumn[0]), coulumn[1], Integer.parseInt(coulumn[2]), Integer.parseInt(coulumn[3])));
			}
			for(Student s:list) {
				System.out.println(s.toString());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
