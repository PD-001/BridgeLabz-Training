public class CalcProfitLoss {
    public static void main(String[] args) {
        int costPrice= 12;
        int sellingPrice= 191;

        int profit=sellingPrice - costPrice;//calculating profit
        int profitPercent= (profit / costPrice) * 100;//calculating profit percentage

        System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellingPrice + 
        ".\nThe Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercent + ".");
    }
}
