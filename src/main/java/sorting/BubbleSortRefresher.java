package sorting;

import java.util.Arrays;

public class BubbleSortRefresher {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for(int outerCounter = intArray.length -1; outerCounter > 0; outerCounter--){
            for(int innerCounter = 0; innerCounter < outerCounter; innerCounter++){
                swap(intArray, innerCounter, innerCounter+1);
            }
        }
        Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }

    private static void swap(int[] array, int position, int nextPosition){

        if(array[position] > array[nextPosition]){
            int temp = array[position];
            array[position] = array[nextPosition];
            array[nextPosition] = temp;
            return;
        }
        return;
    }
}
