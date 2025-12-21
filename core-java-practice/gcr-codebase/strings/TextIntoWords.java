import java.util.Scanner;
public class TextIntoWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[] usingCharAt= splitUsingCharAt(text);//custom method
        String[] usingBuiltIn= text.split(" ");//built-in method
        
        boolean result= compareArrays(usingCharAt, usingBuiltIn);//compare both arrays
        
        System.out.println("Custom split:");
        for(String word: usingCharAt) {
            System.out.println(word);
        }
        
        System.out.println("Built-in spliy:");
        for(String word: usingBuiltIn) {
            System.out.println(word);
        }
        
        System.out.println("Comparision result:"+ result);
        sc.close();
    }
    public static int lengthOfString(String text) {//custom method to find length
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
    public static String[] splitUsingCharAt(String text) {//custom method to split string into words
        int length= lengthOfString(text);
        int wordCount=1;
        
        for(int i=0;i<length;i++) {
            if(text.charAt(i)==' ') {
                wordCount++;
            }
        }
        
        String[] words= new String[wordCount];
        int index=0;
        String word="";
        
        for(int i=0;i<length;i++) {
            if(text.charAt(i)!=' ') {
                word+= text.charAt(i);
            } else {
                words[index++]= word;
                word="";
            }
        }
        words[index]= word;
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {//compare two string arrays
        if(arr1.length!= arr2.length) {
            return false;
        }
        for(int i=0;i<arr1.length;i++) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
