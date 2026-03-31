import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base= sc.nextDouble();
        double height= sc.nextDouble();

        double areaCM= 0.5 * base * height;// area of triangle formula
        double areaFeet= areaCM / 144;// converting square cm to square feet
        double areaInch= areaCM / 6.25;// converting square cm to square inches

        System.out.println("Area of triangle in cm is "+ areaCM +", in feet is "+ areaFeet +" and in inches is "+ areaInch +".");
        sc.close();
    }    
}
