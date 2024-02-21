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

    public getFoodGroup(){
        System.out.println(foodGroup);
    }

    public setFoodGroup(String newGroup){
        foodGroup = newGroup;
    }

    public getFoodType(){
        System.out.println(foodType);
    }

    public setFoodType(String newType){
        foodType = newType;
    }

    public getAmount(){
        System.out.println(amount+"oz.");
    }

    public setAmount(int newAmount){
        amount = newAmount;
    }

    public getOnShelf(){
        System.out.println(onShelf);
    }

    public setOnShelf(String newOnShelf){
        onShelf = newOnShelf;
    }

    public putOnShelf(){
        if(onShelf = true){
            System.out.println("the food is already n the shelf.");
        }
        else{
            System.out.println("The food is placed on the shelf.");
            onShelf = true;
        }
    }

}
