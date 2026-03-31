import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;
        int originalNumber= number;

        while(originalNumber != 0){
            int digit= originalNumber%10;// Get last digit
            sum += digit;// Sum of digits
            originalNumber /= 10;
        }

        //check if number divisible by sum
        if(number % sum == 0){
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
        sc.close();

    }
}
