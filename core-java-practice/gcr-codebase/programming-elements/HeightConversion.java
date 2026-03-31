import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double heightInCm= sc.nextDouble();

        double heightInInch= heightInCm / 2.54;// 1 inch = 2.54 cm

        double heightInFeet= heightInInch / 12;// 1 feet = 12 inch

        System.out.println("Your Height in cm is "+ heightInCm + " while in feet is "+ heightInFeet +" and inches is "+ heightInInch +".");
        sc.close();
    }
}
