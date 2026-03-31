import java.util.Scanner;

public class FirstSmallestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

        if(number1<number2 && number1<number3){//check if first number is smaller than both
            System.out.println("Is the fist number the smallest? Yes");
        }
        else{
            System.out.println("Is the fist number the smallest? No");
        }
        sc.close();
        
    }
}
