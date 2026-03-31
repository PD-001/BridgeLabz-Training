import java.util.Scanner;

public class SquareParameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double side= sc.nextDouble();

        double perimeter= 4 * side;// perimeter of square formula

        System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter +".");
        sc.close();
    }
}
