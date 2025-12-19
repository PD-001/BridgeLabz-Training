import java.util.Scanner;

public class CompareForAndFormula {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // Sum using for loop
        int sumFor=0;
        for(int i=1; i<=n; i++){
            sumFor += i;
        }

        // Sum using formula
        int sumFormula= n*(n+1)/2;
        
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
        sc.close();
    }
}
