import java.util.Scanner;

public class ShortestLongestString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[] words= splitUsingCharAt(text);//custom method to split string into words
        String[][] wordLength= wordsWithLength(words);//method to get words with their lengths
        int[] result= findShortestAndLongest(wordLength);//method to find shortest and longest word lengths
        
        System.out.println("Shortest word length: "+ result[0]);
        System.out.println("Longest word length: "+ result[1]);
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
    
    public static String[] splitUsingCharAt(String text) {
        int length= lengthOfString(text);
        int wordCount=1;
        
        for(int i=0;i<length;i++) {//count words
            if(text.charAt(i)==' ') {
                wordCount++;
            }
        }
        
        String[] words= new String[wordCount];
        String word="";
        int index=0;
        
        for(int i=0;i<length;i++) {//split words
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
    
    public static String[][] wordsWithLength(String[] words) {
        String[][] result= new String[words.length][2];
        
        for(int i=0;i<words.length;i++) {//get words with their lengths
            int len= lengthOfString(words[i]);
            result[i][0]= words[i];
            result[i][1]= String.valueOf(len);
        }
        return result;
    }
    
    public static int[] findShortestAndLongest(String[][] data) {
        int shortest= Integer.parseInt(data[0][1]);
        int longest= Integer.parseInt(data[0][1]);
        
        for(int i=1;i<data.length;i++) {
            int len= Integer.parseInt(data[i][1]);//get length as integer
            if(len<shortest) {
                shortest= len;
            }
            if(len>longest) {
                longest= len;
            }
        }
        int[] result= new int[2];
        result[0]= shortest;
        result[1]= longest;
        return result;
    }
}
