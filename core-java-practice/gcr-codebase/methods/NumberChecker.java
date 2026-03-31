import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        
        int count= countDigits(number);
        int[] digits= storeDigits(number,count);
        
        // Question 2
        System.out.println("\n--- Question 2 ---");
        System.out.println("Sum of digits: "+ sumOfDigits(digits));
        System.out.println("Sum of squares of digits: "+ sumOfSquares(digits));
        System.out.println("Is Harshad Number: "+ isHarshad(number,digits));
        
        int[][] freq= digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<freq.length;i++) {
            System.out.println(freq[i][0]+" -> "+freq[i][1]);
        }
        
        // Question 3
        System.out.println("\n--- Question 3 ---");
        int[] reversed= reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for(int i=0;i<reversed.length;i++) {
            System.out.print(reversed[i]+" ");
        }
        System.out.println("\nIs Palindrome: "+ isPalindrome(digits,reversed));
        System.out.println("Is Duck Number: "+ isDuckNumber(digits));
        
        // Question 4
        System.out.println("\n--- Question 4 ---");
        System.out.println("Is Prime: "+ isPrime(number));
        System.out.println("Is Neon Number: "+ isNeon(number));
        System.out.println("Is Spy Number: "+ isSpy(digits));
        System.out.println("Is Automorphic Number: "+ isAutomorphic(number));
        System.out.println("Is Buzz Number: "+ isBuzz(number));
        
        // Question 5
        System.out.println("\n--- Question 5 ---");
        System.out.println("Is Perfect Number: "+ isPerfect(number));
        System.out.println("Is Abundant Number: "+ isAbundant(number));
        System.out.println("Is Deficient Number: "+ isDeficient(number));
        
        // Question 6
        System.out.println("\n--- Question 6 ---");
        System.out.println("Is Strong Number: "+ isStrong(number,digits));
        
        sc.close();
    }
    
    // Common Methods
    public static int countDigits(int number) {
        int count=0;
        while(number>0) {
            count++;
            number/=10;
        }
        return count;
    }
    
    public static int[] storeDigits(int number,int count) {
        int[] digits= new int[count];
        for(int i=count-1;i>=0;i--) {
            digits[i]= number%10;
            number/=10;
        }
        return digits;
    }
    
    // Question 2 Methods
    public static int sumOfDigits(int[] digits) {
        int sum=0;
        for(int i=0;i<digits.length;i++) {
            sum+= digits[i];
        }
        return sum;
    }
    
    public static int sumOfSquares(int[] digits) {
        int sum=0;
        for(int i=0;i<digits.length;i++) {
            sum+= Math.pow(digits[i],2);
        }
        return sum;
    }
    
    public static boolean isHarshad(int number,int[] digits) {
        return number%sumOfDigits(digits)==0;
    }
    
    public static int[][] digitFrequency(int[] digits) {
        int[] freq= new int[10];
        for(int i=0;i<digits.length;i++) {
            freq[digits[i]]++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++) {
            if(freq[i]>0) count++;
        }
        int[][] result= new int[count][2];
        int index=0;
        for(int i=0;i<freq.length;i++) {
            if(freq[i]>0) {
                result[index][0]= i;
                result[index][1]= freq[i];
                index++;
            }
        }
        return result;
    }
    
    // Question 3 Methods
    public static int[] reverseDigits(int[] digits) {
        int[] rev= new int[digits.length];
        for(int i=0;i<digits.length;i++) {
            rev[i]= digits[digits.length-1-i];
        }
        return rev;
    }
    
    public static boolean isPalindrome(int[] a,int[] b) {
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for(int i=0;i<digits.length;i++) {
            if(digits[i]!=0) return true;
        }
        return false;
    }
    
    // Question 4 Methods
    public static boolean isPrime(int number) {
        if(number<=1) return false;
        for(int i=2;i<=Math.sqrt(number);i++) {
            if(number%i==0) return false;
        }
        return true;
    }
    
    public static boolean isNeon(int number) {
        int square= number*number;
        int sum=0;
        while(square>0) {
            sum+= square%10;
            square/=10;
        }
        return sum==number;
    }
    
    public static boolean isSpy(int[] digits) {
        int sum=0,product=1;
        for(int i=0;i<digits.length;i++) {
            sum+= digits[i];
            product*= digits[i];
        }
        return sum==product;
    }
    
    public static boolean isAutomorphic(int number) {
        int square= number*number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
    
    public static boolean isBuzz(int number) {
        return number%7==0 || number%10==7;
    }
    
    // Question 5 Methods
    public static boolean isPerfect(int number) {
        int sum=0;
        for(int i=1;i<=number/2;i++) {
            if(number%i==0) sum+= i;
        }
        return sum==number;
    }
    
    public static boolean isAbundant(int number) {
        int sum=0;
        for(int i=1;i<=number/2;i++) {
            if(number%i==0) sum+= i;
        }
        return sum>number;
    }
    
    public static boolean isDeficient(int number) {
        int sum=0;
        for(int i=1;i<=number/2;i++) {
            if(number%i==0) sum+= i;
        }
        return sum<number;
    }
    
    // Question 6 Methods
    public static boolean isStrong(int number,int[] digits) {
        int sum=0;
        for(int i=0;i<digits.length;i++) {
            int fact=1;
            for(int j=1;j<=digits[i];j++) {
                fact*= j;
            }
            sum+= fact;
        }
        return sum==number;
    }
}
