import java.util.Scanner;

public class VowelsAndConsonent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        int[] result= countVowelsAndConsonents(text);//count vowels and consonants
        
        System.out.println("Vowels count: "+ result[0]);
        System.out.println("Consonants count: "+ result[1]);
        sc.close();
    }
    
    public static String checkCharacter(char ch) {
        if(ch>='A' && ch<='Z') {//uppercase letter
            ch= (char)(ch+32);//convert to lowercase
        }
        
        if(ch>='a' && ch<='z') {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {//vowel check
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonents(String text) {
        int vowels=0;
        int consonants=0;
        
        int index=0;
        try {
            while(true) {
                char ch= text.charAt(index);//get character at index
                String result= checkCharacter(ch);//check if vowel or consonant
                
                if(result.equals("Vowel")) {
                    vowels++;
                } else if(result.equals("Consonant")) {
                    consonants++;
                }
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {//end of string reached
        }
        
        int[] count= new int[2];
        count[0]= vowels;
        count[1]= consonants;
        return count;
    }
}
