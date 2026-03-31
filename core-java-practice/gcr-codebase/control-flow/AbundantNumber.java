import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;

        for(int i=1; i<number; i++){
            if(number%i==0){//to find divisors
                sum+=i;//add divisor to sum
            }
        }

        if(sum > number){//if sum is more than number
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        sc.close();
    }
}