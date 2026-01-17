package annotationandreflection.reflection.dependencyinjection;

public class Controller {

	@Inject
	Service service;

	public void run() {
		service.work();
	}
}
