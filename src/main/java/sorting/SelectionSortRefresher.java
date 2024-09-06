package sorting;

import java.util.Arrays;

public class SelectionSortRefresher {


    //The Big(O) for this is O(n2) as well
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int outerLoop = intArray.length-1; outerLoop > 0; outerLoop--){

            int largest = 0;
            for(int innerLoop = 1; innerLoop <=outerLoop; innerLoop++){
                if(intArray[largest] < intArray[innerLoop]) {
                    largest = innerLoop;
                }
            }

            swap(intArray, largest, outerLoop);

        }
        Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }

    private static void swap(int[] intArray, int startingIndex, int lastIndex){
        int temp = intArray[startingIndex];
        intArray[startingIndex] = intArray[lastIndex];
        intArray[lastIndex] = temp;
    }
}
