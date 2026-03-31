import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>0){//check if number is positive
            for(int i=1;i<=number;i++){//loop from 1 to number
                if(i%2==0){
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        }
        else{
            System.out.println("The number  is not a natural number");
        }
        sc.close();
    }
}
