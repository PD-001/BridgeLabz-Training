import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double feet= sc.nextDouble();

        double yards= feet / 3;// 1 yard = 3 feet

        double miles= yards / 1760;// 1 mile = 1760 yards

        System.out.println("For the given feet "+ feet +", the yards is "+ yards +" and miles is "+ miles +".");
        sc.close();
    }    
}
