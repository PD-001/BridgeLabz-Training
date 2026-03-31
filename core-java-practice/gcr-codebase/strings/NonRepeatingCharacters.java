import java.util.Scanner;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        
        char result= firstNonRepeatingCharacter(text);
        
        if(result!='\0') {
            System.out.println("First non-repeating character: "+ result);
        } else {
            System.out.println("No non-repeating character found");
        }
        sc.close();
    }
    
    public static char firstNonRepeatingCharacter(String text) {
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
        
        index=0;
        try {
            while(true) {
                char ch= text.charAt(index);
                if(freq[ch]==1) {
                    return ch;
                }
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        return '\0';
    }
}
