import java.util.Scanner;
public class TasksOnFactors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        
        int[] factors= findFactors(number);
        
        System.out.print("Factors: ");
        for(int i=0;i<factors.length;i++) {
            System.out.print(factors[i]+" ");
        }
        
        int greatest= findGreatestFactor(factors);
        int sum= findSumOfFactors(factors);
        long product= findProductOfFactors(factors);
        double cubeProduct= findProductOfCubes(factors);
        
        System.out.println("\nGreatest Factor: "+ greatest);
        System.out.println("Sum of Factors: "+ sum);
        System.out.println("Product of Factors: "+ product);
        System.out.println("Product of Cube of Factors: "+ cubeProduct);
        
        sc.close();
    }
    
    public static int[] findFactors(int number) {
        int count=0;
        
        // Count factors
        for(int i=1;i<=number;i++) {
            if(number%i==0) {
                count++;
            }
        }
        
        int[] factors= new int[count];
        int index=0;
        
        // Store factors
        for(int i=1;i<=number;i++) {
            if(number%i==0) {
                factors[index]= i;
                index++;
            }
        }
        return factors;
    }
    
    public static int findGreatestFactor(int[] factors) {
        int max= factors[0];
        for(int i=1;i<factors.length;i++) {
            if(factors[i]>max) {
                max= factors[i];
            }
        }
        return max;
    }
    
    public static int findSumOfFactors(int[] factors) {
        int sum=0;
        for(int i=0;i<factors.length;i++) {
            sum+= factors[i];//add factor to sum
        }
        return sum;
    }
    
    public static long findProductOfFactors(int[] factors) {
        long product=1;
        for(int i=0;i<factors.length;i++) {
            product*= factors[i];//multiply factor to product
        }
        return product;
    }
    
    public static double findProductOfCubes(int[] factors) {
        double product=1;
        for(int i=0;i<factors.length;i++) {
            product*= Math.pow(factors[i],3);//multiply cube of factor to product
        }
        return product;
    }
}
