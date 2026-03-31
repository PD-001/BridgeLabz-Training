import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        char[] result= findUniqueCharacters(text);//custom method
        
        System.out.println("Unique characters:");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
    
    public static int lengthOfString(String text) {
        int count=0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {//exception thrown when index exceeds length
        }
        return count;
    }
    
    public static char[] findUniqueCharacters(String text) {
        int length= lengthOfString(text);
        char[] temp= new char[length];
        int uniqueCount=0;
        
        for(int i=0;i<length;i++) {//check each character
            char ch= text.charAt(i);
            boolean isUnique=true;//check if character is unique
            
            for(int j=0;j<i;j++) {//check previous characters
                if(ch== text.charAt(j)) {//if character already exists
                    isUnique=false;//mark as not unique
                    break;
                }
            }
            
            if(isUnique) {
                temp[uniqueCount++]= ch;//add unique character to temp array
            }
        }
        
        char[] result= new char[uniqueCount];//create result array of unique size
        for(int i=0;i<uniqueCount;i++) {
            result[i]= temp[i];//copy unique characters to result array
        }
        return result;
    }
}
