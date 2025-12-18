import java.util.Scanner;

public class MileToKiloInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km= sc.nextInt();
        
        double miles= km * 1.6;// 1 mile = 1.6 kilometers

        System.out.println("The total miles is "+ miles +"mile for the given "+ km +" kilometers.");
        sc.close();
    }
}
