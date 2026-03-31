import java.util.Scanner;
import java.lang.Math;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double base= sc.nextDouble();// base input
        double exp= sc.nextDouble();// exponent input
        double result= Math.pow(base, exp);// calculate power
        System.out.println("Result: "+result);
    }    
}
