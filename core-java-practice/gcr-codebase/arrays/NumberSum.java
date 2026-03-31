import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] numbers= new double[10];
        double sum= 0;
        int index=0;

        while(true){
            if(index==10) break;// if number is >10
            double input= sc.nextDouble();
            if(input<=0) break;// if number is negative or zero
            numbers[index]= input;
            index++;
        }

        for(int i=0;i<10;i++){
            sum+= numbers[i];// sym of all numbers
        }

        System.out.println(sum);
        sc.close();
    }
}
