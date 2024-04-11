public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linear = new LinearSearch();
        OneThousandSortedRandomNumbers list = new OneThousandSortedRandomNumbers();

        linear.output(linear.search(list.getSortedNumbers(), -8388));
        linear.output(linear.search(list.getSortedNumbers(), 9807));
        linear.output(linear.search(list.getSortedNumbers(), -4011));
        linear.output(linear.search(list.getSortedNumbers(), 5423));
        linear.output(linear.search(list.getSortedNumbers(), -4));
        linear.output(linear.search(list.getSortedNumbers(), 56));
        linear.output(linear.search(list.getSortedNumbers(), -990));
        linear.output(linear.search(list.getSortedNumbers(), 999));
    }

    public int search(int[] arr, int num){  //returns and int, accepts an array and a target number
        for(int i=0; i<arr.length; i++){   //loops through each index of array
            if(num ==arr[i]){    //checks if this index equals the target number
                System.out.println("Loops: "+(i+1)); //prints out the index plus 1 because that will be the itiration
                return i;  //this will return the first index that matches the target value
            }
        }
        return -1;  //if no indexs match the target value than it will return -1
    }

    public void output(int index){
        if(index >=0){
            System.out.println("Location : "+index);
        }
        else{
            System.out.println("Location not found.");
        }
    }
}//used linear search and a custome method to interpret it to find the numbers.