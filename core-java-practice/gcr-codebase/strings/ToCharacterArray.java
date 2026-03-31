import java.util.Scanner;

public class ToCharacterArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        char[] usingCharAt= convertUsingCharAt(str);//using charAt method
        char[] usingBuiltIn= str.toCharArray();//using built-in toCharArray method

        boolean equalCheck= compareCharArrays(usingCharAt,usingBuiltIn);//using user-defined comparison method

        System.out.println("Comparison result "+ equalCheck);
        sc.close();
    }
    public static char[] convertUsingCharAt(String s){
        char[] charArray= new char[s.length()];
        for(int i=0;i<s.length();i++){
            charArray[i]= s.charAt(i);//store each character in array
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2){
        if(arr1.length!= arr2.length) return false;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!= arr2[i]){//compare each character
                return false;//mismatch found
            }
        }
        return true;
    }
}
