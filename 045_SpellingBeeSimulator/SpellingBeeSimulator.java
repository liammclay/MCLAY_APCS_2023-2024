import java.util.Scanner;
public class SpellingBeeSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the word that you would like me to spell? ");
        String word = scan.nextLine();

        System.out.print(word+". "+word+" is spelled ");

        for(int i = 0; i < word.length(); i++){

            System.out.print(word.substring(i,i+1));

            if(i < word.length()-1){
                System.out.print("-");
            }
            else{
                System.out.println(".");
            }
        }
    }
}
//asked for the word printed out the first part of the reponse then use a for loop print out the letters and dashes