import java.util.Scanner;
public class SelectionSortSomeIntegers {
    public static void main(String[] args) {
        SelectionSortSomeIntegers selection = new SelectionSortSomeIntegers();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many random integers would you like to generate?");
        int num = scan.nextInt();
        System.out.println("Here are your integers:");

        int[] integers = new int[num];

        for(int i=0; i<num; i++){
            int integer = (int) (Math.random()*num*1000+1);
            integers[i] = integer;
            System.out.print(integer+", ");
        }
        
        System.out.println("");
        System.out.println("Here are your integers sorted:");

        selection.sort(integers);
        for(int integer:integers){
            System.out.print(integer+", ");
        }

    }

    public int[] sort(int[] arr){  //takes in an int[] and returns one
        for(int i=0; i<arr.length; i++){  //looping through array
            int minIndex = i; // the cuurent smallest numbers position
            for(int j=i+1; j<arr.length; j++){  // loops through again but this time with j being the next index
                if(arr[j]<arr[minIndex]){
                    minIndex = j;  //  if the number compared to the current smallest is smaller that replace it 
                }
            }

            int temp = arr[i];  //stores the current number in the spot we are trying to sort
            arr[i] = arr[minIndex];  // puts the sorted number in its new spot
            arr[minIndex] = temp;  // puts the number we had in the spot wherethe new number came from
        }
        return arr;
    }
}
//loaded an array with a for loop, and used selection sort on the array.
// then I printed out the array with a for each loop.