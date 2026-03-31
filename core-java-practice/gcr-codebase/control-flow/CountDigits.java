import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int count= 0;

        while(number != 0){
            number= number/10; // Remove the last digit
            count++; // Increase count by 1
        }

        System.out.println(count);
        sc.close();
    }
}
