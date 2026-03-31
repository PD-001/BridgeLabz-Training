import java.util.Random;
public class HeightComparision {
    public static void main(String[] args) {
        int[] heights= new int[11];
        Random rand= new Random();
        
        //generate random heights between 150 and 250 cms
        for(int i=0;i<heights.length;i++) {
            heights[i]= rand.nextInt(101)+150;
        }
        
        int sum= findSum(heights);
        double mean= findMean(heights);
        int shortest= findShortest(heights);
        int tallest= findTallest(heights);
        
        System.out.println("Player Heights:");
        for(int i=0;i<heights.length;i++) {
            System.out.print(heights[i]+" ");
        }
        
        System.out.println("\n\nSum of heights: "+ sum);
        System.out.println("Mean height: "+ mean);
        System.out.println("Shortest height: "+ shortest);
        System.out.println("Tallest height: "+ tallest);
    }
    
    public static int findSum(int[] heights) {
        int sum=0;
        for(int i=0;i<heights.length;i++) {
            sum+= heights[i];//add height to sum
        }
        return sum;
    }
    
    public static double findMean(int[] heights) {
        int sum= findSum(heights);
        return (double)sum/heights.length;//calculate mean
    }
    
    public static int findShortest(int[] heights) {
        int min= heights[0];
        for(int i=1;i<heights.length;i++) {
            if(heights[i]<min) {
                min= heights[i];//update min if current height is smaller
            }
        }
        return min;
    }
    
    public static int findTallest(int[] heights) {
        int max= heights[0];
        for(int i=1;i<heights.length;i++) {
            if(heights[i]>max) {
                max= heights[i];//update max if current height is larger
            }
        }
        return max;
    }
}
