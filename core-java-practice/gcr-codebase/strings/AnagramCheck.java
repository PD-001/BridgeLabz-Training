import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text1= sc.nextLine();
        String text2= sc.nextLine();
        
        boolean result= isAnagram(text1, text2);
        
        if(result) {
            System.out.println("The given texts are anagrams");
        } else {
            System.out.println("The given texts are not anagrams");
        }
        sc.close();
    }
    
    public static int lengthOfString(String text) {//Calculate length without using length() method
        int count=0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    
    public static boolean isAnagram(String text1, String text2) {
        int len1= lengthOfString(text1);//Calculate lengths of both strings
        int len2= lengthOfString(text2);//Calculate lengths of both strings
        
        if(len1!= len2) {
            return false;
        }
        
        int[] freq1= new int[256];
        int[] freq2= new int[256];
        
        int index=0;
        try {
            while(true) {//Build frequency array for first string
                char ch= text1.charAt(index);
                freq1[ch]++;
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        index=0;
        try {
            while(true) {//Build frequency array for second string
                char ch= text2.charAt(index);
                freq2[ch]++;
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        for(int i=0;i<256;i++) {//Compare frequency arrays
            if(freq1[i]!= freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
