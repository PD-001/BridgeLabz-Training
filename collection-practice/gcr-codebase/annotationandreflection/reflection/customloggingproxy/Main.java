package annotationandreflection.reflection.customloggingproxy;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {

		Greeting realObj= new GreetingImplementation();

		LoggingHandler handler= new LoggingHandler(realObj);

		Greeting proxy= (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[]{Greeting.class},handler);

		proxy.sayHello();
		proxy.sayHello();

		System.out.println("Logged Calls");
		handler.printLog();
	}
}
