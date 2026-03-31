import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        String[][] result= findCharacterFrequency(text);
        
        System.out.println("Character-Frequency");
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i][0] + "-" + result[i][1]);
        }
        sc.close();
    }
    
    public static String[][] findCharacterFrequency(String text) {
        int[] freq= new int[256];//ASCII size
        
        int index=0;
        try {
            while(true) {//Infinite loop to traverse the string
                char ch= text.charAt(index);
                freq[ch]++;
                index++;//Move to next character
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        int count=0;
        index=0;
        try {
            while(true) {//Count distinct characters
                char ch= text.charAt(index);//Get character at current index
                if(freq[ch]>0) {//If character frequency is positive
                    count++;//Increment distinct character count
                    freq[ch]= -freq[ch];//Mark character as counted by negating its frequency
                }
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        String[][] result= new String[count][2];
        int resultIndex=0;
        
        index=0;
        try {
            while(true) {
                char ch= text.charAt(index);//Get character at current index
                if(freq[ch]<0) {//If character is marked as counted
                    result[resultIndex][0]= String.valueOf(ch);//Store character
                    result[resultIndex][1]= String.valueOf(-freq[ch]);//Store frequency
                    freq[ch]=0;//Reset frequency to avoid duplicate entries
                    resultIndex++;//Move to next result index
                }
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        return result;
    }
}
