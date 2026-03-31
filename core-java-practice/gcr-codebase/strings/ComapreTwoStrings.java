import java.util.Scanner;

public class ComapreTwoStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();

        boolean  equalCharAt= checkEqualCharAt(str1, str2);//using charAt method
        boolean areEqualBuiltIn= str1.equals(str2);//using built-in equals method

        System.out.println("using charAt "+ equalCharAt);
        System.out.println("using built-in equals "+ areEqualBuiltIn);
        sc.close();
    }
    public static boolean checkEqualCharAt(String s1,String s2){
        if(s1.length()!= s2.length()) return false;

        for(int i=0;i<s1.length();i++){//compare character by character
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
