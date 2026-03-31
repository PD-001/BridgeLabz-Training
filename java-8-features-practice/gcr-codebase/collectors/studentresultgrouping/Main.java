package collectors.studentresultgrouping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	String name;
	int gradeLevel;
	
	public Student(String name, int gradeLevel) {
		this.name= name;
		this.gradeLevel= gradeLevel;
	}
	
	@Override
	public String toString() {
		return "Name:"+ name +" -Grade Level: "+ gradeLevel;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Student> list= new ArrayList<Student>(
				Arrays.asList(
						new Student("Prakash", 12),
						new Student("Pushpak", 11),
						new Student("Anubhav", 11),
						new Student("Sahil", 12)
				));
		
		Map<Integer ,List<String>> grouped= list.stream()
			.collect(Collectors.groupingBy(s->s.gradeLevel, Collectors.mapping(s->s.name, Collectors.toList())));
		
		System.out.println(grouped);
	}
}
