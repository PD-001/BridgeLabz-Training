import java.util.Scanner;

public class CreateAndCompareSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int start= sc.nextInt();
        int end= sc.nextInt();

        String usingCharAt= createUsingCharAt(str,start,end);//using charAt method
        String usingBuiltIn= str.substring(start,end);//using built-in substring method

        boolean equalCheck= usingCharAt.equals(usingBuiltIn);//using built-in equals method

        System.out.println("Substring using charAt: "+ usingCharAt);
        System.out.println("Substring using built-in substring: "+ usingBuiltIn);
        System.out.println("Comparison result "+ equalCheck);
        sc.close();
    }
    public static String createUsingCharAt(String s,int start,int end){
        String result= "";
        for(int i=start-1;i<end-1;i++){
            result+=s.charAt(i);
        }
        return result;
    }
}
