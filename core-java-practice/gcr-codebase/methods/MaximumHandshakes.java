import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int noOfStudents= sc.nextInt();
        int maxHandshakes= calMaxHandshakes(noOfStudents);
        System.out.println("Maximum number of handshakes: "+ maxHandshakes);
        sc.close();
    }
    public static int calMaxHandshakes(int n) {
        return (n*(n-1))/2; // Combination formula C(n, 2)
    }
}
