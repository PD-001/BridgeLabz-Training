package annotationandreflection.reflection.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class LoggingHandler implements InvocationHandler {
	Object target;
	LinkedList<String> ll;

	public LoggingHandler(Object target) {
		this.target = target;
		ll = new LinkedList<>();
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		ll.add("Method called: " + method.getName());

		return method.invoke(target, args);
	}

	public void printLog() {
		for(String s : ll) {
			System.out.println(s);
		}
	}

}
