import java.util.Scanner;

public class MultiplesBelow100UsingWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>0 && number<100){//check for positive and <100
            int i=100;
            while(i>=1){
                if(i%number==0){//if i divides the number
                    System.out.println(i);//print the value of i
                }
                i--;
            }
        }
        else{
            System.out.println("Number not positive or not <100.");
        }
        sc.close();
    }
}
