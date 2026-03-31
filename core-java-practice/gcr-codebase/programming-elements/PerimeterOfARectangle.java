import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double len= sc.nextDouble();// length input
        double breadth= sc.nextDouble();// breadth input
        double per= 2*(len+breadth);// calculate perimeter
        System.out.println("Perimeter of Rectangle: "+per);
    }
}   