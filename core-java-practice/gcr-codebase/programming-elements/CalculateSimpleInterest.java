import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double p= sc.nextDouble();// principal input
        double rate= sc.nextDouble();// rate input
        double time= sc.nextDouble();// time input
        double sI= (p*rate*time)/100;// calculate simple interest
        System.out.println("Simple Interest: "+sI);
    }    
}
