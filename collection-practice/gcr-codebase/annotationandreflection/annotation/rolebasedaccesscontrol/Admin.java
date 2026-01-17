package annotationandreflection.annotation.rolebasedaccesscontrol;

@RoleAllowed(role="ADMIN")
public class Admin{
	public static void highAuthorityTask() {
		System.out.println("run with admin access only");
	}
}
