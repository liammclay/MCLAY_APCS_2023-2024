public class LoopYourName {
    public static void main(String[] args) {
        String name = "Liam";

        for(int i = 0; i<name.length(); i++){
            System.out.println(name.substring(i,i+1));
        }
    }
}
//made my name in a string, used a for loop to print out each index on a new line