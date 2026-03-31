import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        boolean isPrime= true;

        if(number>1){//check if >1
            for(int i=2; i<=number; i++){
                if(number%i==0){//if reaminder 0
                    isPrime= false;//set isPrime to false
                    break;
                }
            }
            if(isPrime){//check isPrime
                System.out.println("Is a prime number.");
            }
            else{
                System.out.println("Is not a prime number.");
            }
        }
        else{
            System.out.println("Is not a prime number.");
        }
        sc.close();
    }
}
