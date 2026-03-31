import java.util.Scanner;

public class RoundsAroundPark {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double side1= sc.nextDouble();
        double side2= sc.nextDouble();
        double side3= sc.nextDouble();
        
        double rounds= calculateRounds(side1, side2, side3);
        
        System.out.println("Number of rounds required"+ rounds);
        sc.close();
    }
    
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter= side1 + side2 + side3;
        double totalDistance= 5000;   // 5 km in meters
        double rounds= totalDistance / perimeter;
        return rounds;
    }
}
