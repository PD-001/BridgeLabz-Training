import java.util.Scanner;

public class MultiplicationSixToNine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int[] table= new int[10];
		int number= sc.nextInt();
		
		if(number<=9 && number>=6) {
			for(int i=0;i<10;i++) {
				table[i]= number*i;
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(number +" * "+ i +" = "+ table[i]);
		}
        sc.close();
    }    
}
