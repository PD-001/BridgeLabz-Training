import java.util.Scanner;

public class FactorialOfIntegerUsingFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int factorial= 1;

        for(int i=1; i<=number; i++){//loop from 1 to number
            factorial= factorial*i;//calculate factorial of given number
        }
        System.out.println(factorial);
        sc.close();
    }
}
