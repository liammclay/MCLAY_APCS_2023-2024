import java.util.Scanner;
public class DoubloonWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean isDoubloon = true;

        System.out.println("enter a word and i will tell you if it is a doubloon word.");
        String word = scan.nextLine();

        for(int i=0; i<word.length()-1; i++){

            String let = word.substring(i,i+1);
            int count = 0;

            for(int j=0; j<word.length()-1; j++){
                int compare = let.compareToIgnoreCase(word.substring(j,j+1));
            
                if(compare==0){
                    count++;
                }
            }
            if(count == 1){}
            else{
                isDoubloon = false;
                break;
            }
        }

        if(isDoubloon == true){
            System.out.println("the word is a doubloon");
        }
        else if(isDoubloon == false){
            System.out.println("the word is not a doubloon");
        }
        else{
            System.out.println("something went wrong");
        }
    }
}
