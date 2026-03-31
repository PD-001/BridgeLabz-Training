import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //this loop continues until "exit" is inputted
        while (true) {
            //takes choice of coffee as input or whether to exit the program
            System.out.println("Please choose type of coffee:\n"+"1. Plain\n"+"2. Latte\n"+"3. Amercano\n"+" or Exit");
            String coffeeType= sc.nextLine();
            //exits the program if input is "exit"
            if(coffeeType.toLowerCase().equals("exit")){
                System.out.println("Closing the system.");
                sc.close();
                break;
            }
            //takes quantity as input
            System.out.println("Please enter the quantity:");
            int quantity= sc.nextInt();
            sc.nextLine();
            
            double totalCost=0;

            //finds total cost based on quantity and type of coffee
            switch(coffeeType.toLowerCase()){
                case "plain":
                    totalCost= quantity * 30;
                    break;
                case "latte":
                    totalCost= quantity * 50;
                    break;
                case "amercano":
                    totalCost= quantity * 40;
                    break;
                default:
                    System.out.println("Invalid coffee type selected.");
                    sc.close();
            }

            int gst= 18;
            //calculates gst
            double finalCost= totalCost+(totalCost*(gst/100.0));

            //prints out the final cost
            System.out.println("The final cost for "+ quantity +" "+ coffeeType +" is: "+ finalCost);
            
        }
        


    }    
}
