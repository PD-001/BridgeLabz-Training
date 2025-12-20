import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int[] digits= new int[10];
        int index=0;

        while(number!=0){
            int digit= number%10;//take last digit
            digits[index]= digit;//store in array
            index++;
            number= number/10;//remove last digit
            if(index==10) break;
        }

        for(int i=index-1;i>=0;i--){
            System.out.print(digits[i]);//print in reverse order
        }
        sc.close();
    }
}
