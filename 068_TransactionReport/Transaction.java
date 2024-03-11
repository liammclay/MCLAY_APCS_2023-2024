public class Transaction {
    private String itemName;
    private String itemDescription;
    private double itemCost;
    private double itemSalePrice;
    private double itemProfit;
    private double itemMargin;

    public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice){
        this.itemName = itemName;
        this.itemDescription =itemDescription;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
        this.itemProfit = itemSalePrice - itemCost;
        this.itemMargin = itemProfit/itemSalePrice*100;

    }
    //getters
    public String getItemName(){
        return itemName;
    }
    public String getItemDescription(){
        return itemDescription;
    }
    public double getItemCost(){
        return itemCost;
    }
    public double getItemSalePrice(){
        return itemSalePrice;
    }
    public double getItemProfit(){
        return itemProfit;
    }
    public double getItemMargin(){
        return itemMargin;
    }
    //setters
    public void setItemName(String newName){
        itemName = newName;
    }
    public void setItemDescription(String newDescription){
        itemDescription = newDescription;
    }
    public void setItemCost(double newCost){
        itemCost = newCost;
    }
    public void setItemSalePrice(double newSalePrice){
        itemSalePrice = newSalePrice;
    }
    public void setItemProfit(double newProfit){
        itemProfit = newProfit;
    }
    public void getItemMargin(double newMargin){
        itemMargin = newMargin;
    }

    public static void main(String[] args) {}
}
