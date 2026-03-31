import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] studentAge= new int[10];

        //take input of students ages
        for(int i=0;i<10;i++) studentAge[i]=sc.nextInt();

        for(int i=0;i<studentAge.length;i++){
            if(studentAge[i]>=18) {//if students age is >18
                System.out.println("The student with the age "+ studentAge[i] +" can vote.");
            }
            else{
                System.out.println("The student with the age "+ studentAge[i] +" cannot vote.");
            }
        }
        sc.close();
    }    
}
