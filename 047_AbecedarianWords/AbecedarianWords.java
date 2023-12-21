import java.util.Scanner;
public class AbecedarianWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter a word and ill tell you if it is a Abecedarian word. ");
        String word = scan.nextLine();

        Boolean isAbecedarian = true;

        for(int i = 0; i< word.length()-1; i++){
            int compare = word.substring(i,i+1).compareToIgnoreCase(word.substring(i+1,i+2));
            
            if(compare <= 0){}
            else{
                isAbecedarian = false;
            }
        }

        if(isAbecedarian == true){
            System.out.println("the word is abecedarian");
        }
        else if(isAbecedarian == false){
            System.out.println("the word is not abecedarian");
        }
        else{
            System.out.println("something went wrong");
        }


        
    }
}
//asked for word. used boolean to create flag. used a for loop to compare each letter to the one infront. flagged the boolean if it wasnt abecedarian and printed accordingly.

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/