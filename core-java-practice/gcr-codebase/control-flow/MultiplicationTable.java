import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        if(number>=6 && number<=9){
            for(int i=1; i<=10; i++){//loop from 1 to 10
                System.out.println(number +" * "+ i +" = "+ (number*i));//print multiplication table
            }
        }
        sc.close();
    }
}
