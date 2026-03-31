import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double rad= sc.nextDouble();// radius input
        double hei= sc.nextDouble();// height input
        double vol= 3.14*rad*rad*hei;// calculate volume
        System.out.println("Volume of Cylinder: "+vol);
    }    
}
