import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers= new int[5];

        //take 5 numbers as input in array
        for(int i=0;i<5;i++) numbers[i]= sc.nextInt();

        for(int i=0;i<5;i++){

            if(numbers[i]>0){//if number is positive
                if(numbers[i]%2==0) System.out.println("Even");//if number is even
                else System.out.println("Odd");//if number is odd
            } 
            else if(numbers[i]<0) System.out.println("Negative");//if number is negative
            else System.out.println("Zero");//if number is zero

        }
        if(numbers[0]==numbers[numbers.length]) System.out.println("Equal");//if number is equal
        else if(numbers[0]>numbers[numbers.length]) System.out.println("First element is greater thean last element.");
        else System.out.println("Last element is greater thean first element.");
        sc.close();
    }
}
