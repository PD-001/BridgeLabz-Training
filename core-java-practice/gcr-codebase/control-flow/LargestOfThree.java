import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

        if(number1>number2 && number1>number3){//check if first number is larger than both
            System.out.println("The largest number is: "+ number1);
        }
        else if(number2>number1 && number2>number3){//check if second number is larger than both
            System.out.println("The largest number is: "+ number2);
        }
        else{//if both are false then third number is largest
            System.out.println("The largest number is: "+ number3);
        }
        sc.close();
    }
}
