import java.util.Scanner;

public class CountdownUsingFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();

        for(int i=number; i>=0; i--){
            System.out.println(i);//print as countdown for rocket launch using for loop
        }
        sc.close();
    }
}
