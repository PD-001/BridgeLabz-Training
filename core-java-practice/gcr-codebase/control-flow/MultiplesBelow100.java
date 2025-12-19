import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>0 && number<100){//check for positive and <100
            for(int i=100;i>=1;i--){
                if(i%number==0){//if i divides the number
                    System.out.println(i);//print the value of i
                }
            }
        }
        else{
            System.out.println("Number not positive or not <100.");
        }
        sc.close();
    }
}