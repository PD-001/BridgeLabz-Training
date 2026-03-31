import java.util.Scanner;

public class DemoStringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text= scanner.nextLine();
        
        generateStringIndexOutOfBoundExc(text);//error generated if string length is less than 11
        
        scanner.close();
    }
    public static void generateStringIndexOutOfBoundExc(String text) {
       try {
           System.out.println("Calling character at index 10:"+ text.charAt(10));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("Caught StringIndexOutOfBoundsException: "+ e.getMessage());
       }
    }
}
