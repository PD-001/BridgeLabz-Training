import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double rad= sc.nextDouble();
        double area= 3.14*rad*rad;// calculate area
        System.out.println("Area of Circle: "+area);
    }
}