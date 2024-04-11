import java.util.ArrayList;
public class PositiveNegativeAnalysis {

    public void allPositive(ArrayList<Integer> arr){
        System.out.println("Here are all of the positive numbers:");
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>=0){
                System.out.println(arr.get(i));
            }
        }
    }
   
    public void allNegative(ArrayList<Integer> arr){
        System.out.println("Here are all of the negative numbers:");
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)<0){
                System.out.println(arr.get(i));
            }
        }
    }

    public void sumPositive(ArrayList<Integer> arr){
        int total = 0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>=0){
                total+=arr.get(i);
            }
        }
        System.out.println("The sum of all of the positives is "+total);
    }

    public void sumNegative(ArrayList<Integer> arr){
        int total = 0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>=0){
                total+=arr.get(i);
            }
        }
        System.out.println("The sum of all of the negatives is "+total);
    }
}
