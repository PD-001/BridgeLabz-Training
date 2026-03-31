import java.util.Scanner;

public class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double num1= sc.nextDouble();// first number input
        double num2= sc.nextDouble();// second number input
        double num3= sc.nextDouble();// third number input
        double avg= (num1+num2+num3)/3;// calculate average
        System.out.println("Average of Three Numbers: "+avg);
    }    
}
