package annotationandreflection.reflection.retrieveannotationatruntime;

@Author(name= "Prakash")
public class Main {
	public static void main(String[] args) {
		Class<?> cls= Main.class;
		if(cls.isAnnotationPresent(Author.class)) {
			System.out.println(cls.getAnnotation(Author.class).name());
		}
	}
}
