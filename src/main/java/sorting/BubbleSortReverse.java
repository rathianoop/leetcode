package sorting;

import java.util.Arrays;

public class BubbleSortReverse {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int outerLoop = 0; outerLoop < intArray.length; outerLoop++){
            for(int innerLoop = intArray.length-1; innerLoop > outerLoop; innerLoop--){
                swap(intArray, innerLoop, outerLoop);
            }
        }

        Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }

    private static void swap(int[] array, int i, int j){
        if(array[j] < array[i]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            return;
        }
        return;
    }
}
