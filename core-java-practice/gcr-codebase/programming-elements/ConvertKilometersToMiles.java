import java.util.Scanner;

public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double km= sc.nextDouble();// kilometers input
        double miles= km*0.621371;// calculate miles
        System.out.println("Distance in Miles: "+miles);
    }    
}
