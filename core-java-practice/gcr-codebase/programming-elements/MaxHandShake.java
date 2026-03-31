import java.util.Scanner;

public class MaxHandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents= sc.nextInt();

        int maxhs= (numberOfStudents*(numberOfStudents-1))/2;// formula to calculate maximum handshakes is n(n-1)/2 

        System.out.println("No. of posshandshakes "+ maxhs);
        sc.close();
    }
}
