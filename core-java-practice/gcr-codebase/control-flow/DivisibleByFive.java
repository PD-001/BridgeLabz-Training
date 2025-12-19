import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        boolean check= (number%5==0)? true : false;//store true if number divisible by 5 if not store false
        
        System.out.println("Is the number "+ number +" divisible by 5? "+ (check?"Yes":"No"));
        sc.close();
    }
}
