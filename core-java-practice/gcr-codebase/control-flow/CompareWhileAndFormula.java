import java.util.Scanner;

public class CompareWhileAndFormula {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        // Using while loop
        int sumWhile= 0;
        int tempNumber= number;
        while(tempNumber > 0){
            sumWhile+=tempNumber;
            tempNumber--;
        }

        // Using formula
        int sumFormula = number*(number+1)/2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        sc.close();
    }
}
