import java.util.Scanner;;

public class IntOperationProg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        // performing integer operations
        int op1= a+b*c;
        int op2= a*b+c;
        int op3= c+a/b;
        int op4= a%b+c;

        System.out.println("The results of Int Operations are "+ op1 +", "+ op2 +", "+ op3 +", and "+ op4 +".");
        sc.close();
    }
}
