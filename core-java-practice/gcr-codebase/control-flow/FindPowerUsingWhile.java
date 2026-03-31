import java.util.Scanner;

public class FindPowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int power= sc.nextInt();

        if(power>=0 && number>=0){
            int result= 1;
            int i=1;//counter
            while(i<=power){
                result= result*number;//multiply number power times
                i++;
            }
            System.out.println(result);
        }
        else{
            System.out.println("Power or number is negative.");
        }
        sc.close();
    }
}
