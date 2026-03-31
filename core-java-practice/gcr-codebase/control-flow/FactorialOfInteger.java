import java.util.Scanner;

public class FactorialOfInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int factorial= 1;

        while(number>0){//loop until number becomes 0
            factorial= factorial*number;//calculate factorial of given number
            number--;
        }
        
        System.out.println(factorial);
        sc.close();
    }
}