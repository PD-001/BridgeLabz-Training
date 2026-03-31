import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>0){//check if number is positive
            int i=1;
            while(i<=number){//loop from 1 to number
                if(number%i==0){//check if number divisible by i
                    System.out.println(i);//print the value of i
                }
                i++;
            }
        }
        else{
            System.out.println("Number not positive.");
        }
        sc.close();
    }    
}
