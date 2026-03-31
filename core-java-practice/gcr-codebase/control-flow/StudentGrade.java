import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Physics= sc.nextInt();
        int Chemistry= sc.nextInt();
        int Maths= sc.nextInt();

        //calculate total and percentage
        int total= Physics+Chemistry+Maths;
        double percentage= (total/300.0)*100;

        //find grade based on % and print along with remak
        if(percentage>=80){
            System.out.println("Grade A \n Level 4, above agency-normalised standards");
        } 
        else if(percentage>=70 && percentage<80){
            System.out.println("Grade B \n Level 3, at agency-normalised standards");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Grade C \n Level 2, below, but approaching agency-normalised standards");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("Grade D \n Level 1, well below agency-normalised standards");
        }
        else if(percentage>=40 && percentage<50){
            System.out.println("Grade D \n Level 1-, too below agency-normalised standards");
        }
        else{
            System.out.println("Grade R \n Remedial Standards");
        }
        sc.close();
    }
}
