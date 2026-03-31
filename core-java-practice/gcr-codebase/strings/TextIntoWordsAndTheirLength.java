import java.util.Scanner;
public class TextIntoWordsAndTheirLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[] words= splitUsingCharAt(text);//custom method
        String[][] result= wordsWithLength(words); //get words with their lengths
        
        System.out.println("Word-Length");
        for(int i=0;i<result.length;i++) {
            int len= Integer.parseInt(result[i][1]);//convert length back to integer
            System.out.println(result[i][0] + "-" + len);
        }
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
        String word="";
        int index=0;
        
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
    
    public static String[][] wordsWithLength(String[] words) {//method to get words with their lengths
        String[][] result= new String[words.length][2];
        
        for(int i=0;i<words.length;i++) {
            int len= lengthOfString(words[i]);
            result[i][0]= words[i];
            result[i][1]= String.valueOf(len);
        }
        return result;
    }
}
