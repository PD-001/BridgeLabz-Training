import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ages= new int[3];
        double[] heights= new double[3];

        //input ages and heights
        for(int i=0;i<3;i++){
            System.out.println("Enter age for "+ (i+1) + ":");
            ages[i]= sc.nextInt();
            System.out.println("Enter height for "+ (i+1) + " in cm:");
            heights[i]= sc.nextDouble();
        }

        //find youngest and tallest
        int youngest= 0;
        int tallest= 0;

        for(int i=1;i<3;i++){
            if(ages[i]<ages[youngest]){
                youngest=i;
            }
            if(heights[i]>heights[tallest]){
                tallest=i;
            }
        }

        //display results
        System.out.println("The youngest friend is Friend "+ (youngest+1) +" with age "+ages[youngest]);
        System.out.println("The tallest friend is Friend "+ (tallest+1) +" with height "+heights[tallest] + " cm");

        sc.close();
    }    
}
