import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //take input of clients height and weight
        System.out.println("Enter height:\n");
        double weight= sc.nextDouble();
        System.out.println("Eneter Weight:\n");
        double height= sc.nextDouble();

        double heightMeter= height/100; //convert height from cm to meters
        double bmi= weight/(heightMeter*heightMeter); //calculate BMI

        //place and print client based on bmi 
        if(bmi<18.5){
            System.out.println("Client is Underweight");
        }
        else if(bmi>=18.5 && bmi<24.9){
            System.out.println("Client is Normal");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("Client is Overweight");
        }
        else{
            System.out.println("Client is Obese");
        }
        sc.close();
    }
}
