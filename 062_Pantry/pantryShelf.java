public class pantryShelf {
    public static void main(String[] args) {
        foodItem pasta = new food("pasta", "penne", 6);
        foodItem cookie = new food("cookies", "oreo", 10);
        foodItem water = new food("water", "canned", 1000);

        pasta.eat(3);
    }

    public void eat(int eatAmount){
        for(int i=0; i<=foodItem.amonut; i--){
            System.out.println("I am eating one cookie.");
        }
        
        foodItem.amount = foodItem.amount-eatAmount;

        if(foodItem.amount <= 0){
            System.out.println("there isnt any food left.");
        }
        else{
            System.out.println("there is "+foodItem.amount+" food left");
        }
    }
}
