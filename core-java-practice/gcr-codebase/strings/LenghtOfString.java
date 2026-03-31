import java.util.Scanner;
public class LenghtOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        int usingCharAt= lengthOfString(text);
        int usingBulitIn= text.length();
        
        System.out.println("using charAt method: "+ usingCharAt);
        System.out.println("using built-in length() method: "+ usingBulitIn);
        sc.close();
    }
    public static int lengthOfString(String text) {
        int count=0;
        try {
            while(true) {
                text.charAt(count);
                count++;//count until exception is thrown
            }
        } catch (StringIndexOutOfBoundsException e) {
            //handle exception
        }
        return count;
    }
}
