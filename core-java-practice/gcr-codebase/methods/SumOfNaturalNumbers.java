import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int result= sumOfNaturalNumbers(n);
        
        System.out.println("Sum of first " + n + " natural no.s" + result);
        sc.close();
    }
    
    public static int sumOfNaturalNumbers(int n) {
        int sum=0;//initialize sum to 0
        for(int i=1;i<=n;i++) {
            sum+= i;//add i to sum
        }
        return sum;//return the sum
    }
}
