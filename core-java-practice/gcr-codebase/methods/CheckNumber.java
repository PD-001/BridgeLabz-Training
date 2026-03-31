import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        
        int result= checkNumber(num);
        
        if(result==1) {
            System.out.println("Number is Positive");
        } else if(result==-1) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
    
    public static int checkNumber(int num) {
        if(num>0) {//if number is greater than 0
            return 1;
        } else if(num<0) {//if number is less than 0
            return -1;
        }
        return 0;//if number is 0
    }
}
