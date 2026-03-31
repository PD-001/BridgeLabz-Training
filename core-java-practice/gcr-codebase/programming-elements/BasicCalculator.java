import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();

        int sum= number1 + number2;// addition
        int difference= number1 - number2;// subtraction
        int product= number1 * number2;// multiplication
        double division= (double)number1 / number2;// division

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +" is "+ sum +", "+ difference +", "+ product +", "+ division +".");
        sc.close();
    }
}
