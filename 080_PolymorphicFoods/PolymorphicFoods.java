public class PolymorphicFoods {
    public static void main(String[] args) {
        Food[] foods ={new Pizza(9.0, 1000), new Tacos(6.0, 700)};

        for(Food food : foods){
            System.out.println("This "+food.getName()+" has "+food.getCalories()+" calories.");
            if(food instanceof Tacos){
                Tacos taco = (Tacos)food;
                taco.describeTaco();
            }
            else if(food instanceof Pizza){
                Pizza pizza = (Pizza)food;
                pizza.describePizza();
            }
        }
    }
}
