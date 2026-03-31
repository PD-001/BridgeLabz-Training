import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();

        if(year>=1582){//check for year >=1582
            if(year%4==0 ){//check for leap year conditions
                if(year%100!=0){
                    System.out.println("Is a Leap Year.");
                }
                else if(year%400==0){
                    System.out.println("Is a Leap Year.");
                }
            }
            else{
                System.out.println("Is not a Leap Year.");
            }
        }
        else{
            System.out.println("Year not in Gregorian calendar.");
        }
        sc.close();
    }
}
