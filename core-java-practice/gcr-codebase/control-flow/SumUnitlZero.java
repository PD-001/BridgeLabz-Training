import java.util.Scanner;

public class SumUnitlZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double number;
        double sum=0.0;

        while(true){//loop is infinite unitl
            number= sc.nextDouble();
            if(number==0){//user inputs zero and breaks the loop
                break;
            }
            sum+=number;
        }
        System.out.println("Sum of all numbers "+sum);
        sc.close();
    }
}
