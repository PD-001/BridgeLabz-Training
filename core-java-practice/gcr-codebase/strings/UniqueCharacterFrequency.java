import java.util.Scanner;
public class UniqueCharacterFrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[][] result= findFrequencyUsingUnique(text);
        
        System.out.println("Character-Frequency");
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i][0] + "-" + result[i][1]);
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
    
    public static char[] uniqueCharacters(String text) {//Extract unique characters from the string
        int length= lengthOfString(text);
        char[] temp= new char[length];
        int uniqueCount=0;
        
        for(int i=0;i<length;i++) {
            char ch= text.charAt(i);
            boolean isUnique=true;
            
            for(int j=0;j<i;j++) {
                if(ch== text.charAt(j)) {
                    isUnique=false;
                    break;
                }
            }
            
            if(isUnique) {
                temp[uniqueCount++]= ch;
            }
        }
        
        char[] result= new char[uniqueCount];
        for(int i=0;i<uniqueCount;i++) {
            result[i]= temp[i];
        }
        return result;
    }
    
    public static String[][] findFrequencyUsingUnique(String text) {//Find frequency using unique characters
        int[] freq= new int[256];
        
        int index=0;
        try {
            while(true) {
                char ch= text.charAt(index);
                freq[ch]++;
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        char[] unique= uniqueCharacters(text);
        String[][] result= new String[unique.length][2];
        
        for(int i=0;i<unique.length;i++) {
            char ch= unique[i];
            result[i][0]= String.valueOf(ch);
            result[i][1]= String.valueOf(freq[ch]);
        }
        return result;
    }
}
