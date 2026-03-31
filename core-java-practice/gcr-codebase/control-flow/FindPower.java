import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int power= sc.nextInt();

        if(power>=0 && number>=0){
            int result= 1;
            for(int i=1;i<=power;i++){
                result= result*number;//multiply number power times
            }
            System.out.println(result);
        }
        else{
            System.out.println("Power or number is negative.");
        }
        sc.close();
    }
}
