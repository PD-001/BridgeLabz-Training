import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double first= sc.nextDouble();
        double second= sc.nextDouble();
        String op= sc.next();
        int number= sc.nextInt();

        double result;
        for(int i=0;i<number;i++){
            switch (op) {
            case "+":
                result= first+second;
                System.out.println("Result: "+ result);
                break;
            case "-":
                result= first-second;
                System.out.println("Result: "+ result);
                break;
            case "*":
                result= first*second;
                System.out.println("Result: "+ result);
                break;
            case "/":
                if (second!=0) {
                    result= first/second;
                    System.out.println("Result: "+ result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
            }
        }
        sc.close();
    }
}
