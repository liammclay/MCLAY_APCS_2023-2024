public class PolymorphicFoods {
    public static void main(String[] args) {
        Food[] foods ={new Pizza(9.0, 1000, "Cheese"), new tacos(6.0, 700, "Pork")};

        for(Food food : foods){
            System.out.println("This "+food.getName()+" has "+food.getCalories()+" calories.");
            if(food instanceof tacos){
                tacos taco = (tacos)food;
                taco.describeTaco();
            }
            else if(food instanceof Pizza){
                Pizza pizza = (Pizza)food;
                pizza.describePizza();
            }
        }
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/