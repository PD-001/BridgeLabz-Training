import java.util.Scanner;

public class FrequencyOfDigitInNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int[] digits= new int[10];
        int index=0;

        //find digits and store in array
        while(number!=0){
            int digit= number%10;
            digits[index]= digit;
            index++;
            number= number/10;
            if(index==10) break;
        }

        //calculate frequency of each digit
        int[] frequency= new int[10];
        for(int i=0;i<index;i++){
            frequency[digits[i]]++;
        }

        //display frequency of each digit
        for(int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println("Digit "+ i +" occurs "+ frequency[i] +" times.");
            }
        }
        sc.close();
    }
}
