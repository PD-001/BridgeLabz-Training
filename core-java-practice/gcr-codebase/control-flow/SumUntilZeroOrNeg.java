import java.util.Scanner;

public class SumUntilZeroOrNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double number;
        double sum=0.0;

        while(true){//loop is infinite until
            number= sc.nextDouble();
            if(number==0 || number<0){//user inputs zero or negative and breaks the loop
                break;
            }
            sum+=number;//summing all positive numbers
        }
        System.out.println("Sum of all numbers "+sum);
        sc.close();
    }
}