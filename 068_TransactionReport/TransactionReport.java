public class TransactionReport {
    private double totalCost;
    /*private double totalSalePrice;
    private double totalProfit;
    private double totalMargin;
    */

    public void totCost(Transaction[] arr){
        totalCost = Transaction[0].itemCost()+Transaction[1].itemCost()+Transaction[2].itemCost();
        System.out.println("The total cost of all products is "+totalCost+".");
    }
}

