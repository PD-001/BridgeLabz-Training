import java.util.Scanner;
public class OperationsOnFactors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        
        int[] factors= findFactors(num);
        
        for(int i=0;i<factors.length;i++) {
            System.out.print(factors[i] +" ");
        }
        System.out.println();
        
        int sum= sumOfFactors(factors);
        int product= productOfFactors(factors);
        int sumOfSquares= sumOfSquaresOfFactors(factors);
        
        System.out.println("Sum of factors: "+ sum);
        System.out.println("Product of factors: "+ product);
        System.out.println("Sum of squares of factors: "+ sumOfSquares);
        
        sc.close();
    }
    
    public static int[] findFactors(int num) {
        int count= 0;
        
        for(int i=1;i<=num;i++) {
            if(num%i==0) {//if i is a factor
                count++;
            }
        }
        
        int[] factors= new int[count];
        int index= 0;
        
        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                factors[index++]= i;//store factor in array
            }
        }
        return factors;
    }
    
    public static int sumOfFactors(int[] factors) {
        int sum=0;
        for(int i=0;i<factors.length;i++) {
            sum+= factors[i];//add factor to sum
        }
        return sum;
    }
    
    public static int productOfFactors(int[] factors) {
        int product=1;
        for(int i=0;i<factors.length;i++) {
            product*= factors[i];//multiply factor to product
        }
        return product;
    }
    
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum=0;
        for(int i=0;i<factors.length;i++) {
            sum+= Math.pow(factors[i], 2);//add square of factor to sum
        }
        return sum;
    }
}
