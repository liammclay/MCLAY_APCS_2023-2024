public class foodItem {
    private String foodGroup;
    private String foodType;
    private String amount;
    private boolean onShelf;

    public food(String foodGroup, String foodType, int amount){
        this.foodGroup = foodGroup;
        this.foodType = foodType;
        this.amount = amount+"oz.";
        this.onShelf = false;
    }

    public void getFoodGroup(){
        System.out.println(foodGroup);
    }

    public void setFoodGroup(String newGroup){
        foodGroup = newGroup;
    }

    public void getFoodType(){
        System.out.println(foodType);
    }

    public void setFoodType(String newType){
        foodType = newType;
    }

    public void getAmount(){
        System.out.println(amount+"oz.");
    }

    public void setAmount(int newAmount){
        amount = newAmount;
    }

    public void getOnShelf(){
        System.out.println(onShelf);
    }

    public void setOnShelf(String newOnShelf){
        onShelf = newOnShelf;
    }

    public void putOnShelf(){
        if(onShelf = true){
            System.out.println("the food is already n the shelf.");
        }
        else{
            System.out.println("The food is placed on the shelf.");
            onShelf = true;
        }
    }

}
