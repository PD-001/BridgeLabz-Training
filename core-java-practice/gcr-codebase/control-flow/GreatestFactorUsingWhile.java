import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int greatestFactor= 1;
        int counter= number-1;

        while(counter>=1){
            if(number%counter==0){//check if number divisible by counter
                greatestFactor= counter;//assign counter to gf
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor);
        sc.close();
    }
}
