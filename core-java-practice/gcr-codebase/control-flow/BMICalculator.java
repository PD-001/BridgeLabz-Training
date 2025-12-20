import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double weight= sc.nextDouble();
        double height= sc.nextDouble();

        double heightMeter= height/100; //convert height from cm to meters

        double bmi= weight/(heightMeter*heightMeter); //calculate BMI

        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
