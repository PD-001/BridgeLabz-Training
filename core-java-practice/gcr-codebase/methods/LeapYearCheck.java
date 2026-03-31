import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        
        if(year<1582) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        
        boolean result= isLeapYear(year);
        
        if(result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
    
    public static boolean isLeapYear(int year) {
        if((year%4==0 && year%100!=0) || (year%400==0)) {
            return true;
        }
        return false;
    }
}
