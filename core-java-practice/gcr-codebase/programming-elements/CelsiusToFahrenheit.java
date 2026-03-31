import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// scanner obj for input
        double cel= sc.nextDouble();
        double fah= (cel*9/5)+32;// calculate fahrenheit
        System.out.println("Temperature in Fahrenheit: "+fah);
    }
}