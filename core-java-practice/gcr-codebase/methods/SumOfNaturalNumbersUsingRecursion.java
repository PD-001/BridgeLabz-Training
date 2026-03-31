import java.util.Scanner;
public class SumOfNaturalNumbersUsingRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        if(n<=0) {
            System.out.println("Wrong Input");
            sc.close();
            return;
        }
        
        int sumUsingRecursion= sumUsingRecursion(n);
        int sumUsingFormula= sumUsingFormula(n);
        
        System.out.println("Sum using recursion: "+ sumUsingRecursion);
        System.out.println("Sum using formula: "+ sumUsingFormula);
        
        if(sumUsingRecursion==sumUsingFormula) {
            System.out.println("Both results are correct and equal");
        } else {
            System.out.println("Results are not equal");
        }
        sc.close();
    }
    
    public static int sumUsingRecursion(int n) {
        if(n==1) {
            return 1;
        }
        return n+sumUsingRecursion(n-1);
    }
    
    public static int sumUsingFormula(int n) {
        return n*(n+1)/2;
    }
}
