public class PenDistribution {
    public static void main(String[] args) {
        int toatalPen= 14;
        int students= 3;
        int penPerStudent= toatalPen / students;
        int remainingPen= toatalPen % students;
        System.out.println("The Pen Per Student is "+ penPerStudent +" and remaining pen not distributed is "+ remainingPen+".");
    }
}
