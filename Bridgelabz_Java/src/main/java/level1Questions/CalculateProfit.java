package level1Questions;

public class CalculateProfit {
    public static void main(String[] args)
    {
        int cp=129;
        int sp=191;
        int profit=sp-cp;
        double profPercent=(profit*100.0)/cp;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR " +profit+
                " and the Profit Percentage is " +profPercent+"%");
    }
}
