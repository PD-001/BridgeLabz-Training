
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // scnner obj for input
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;// sum of two numbers
        System.out.println("The ssum of "+a+" and "+b+" is: "+sum);
    }
}
