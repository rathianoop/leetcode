package datastructures.arrays;

public class MergeSortedArrays {


    public static int[] mergeSortedArray(int[] array1, int m, int[] array2, int n){

       /* int counter = array1.length;
        int array1_counter = m-1;
        int array2_counter = n-1;

        while(counter>0 && array1_counter >= 0 && array2_counter >= 0){
            if(array1[array1_counter] <= array2[array2_counter]){
                array1[counter-1] = array2[array2_counter];
                array2_counter--;

            }else{
                int temp = array1[array1_counter];
                array1[array1_counter] = array2[array2_counter];
                array1[counter-1] = temp;
                array1_counter--;

            }
            counter--;


        }*/

        int counter = array1.length-1;
        int array1Index =  m--;
        int array2Index =  n-1;

        while(counter >= 0 ) {

            if (array1Index < 0) {
                array1[counter] = array2[array2Index--];
            } else if (array2Index < 0) {
                array1[counter] = array1[array1Index--];
            } else {
                if (array1[array1Index] < array2[array2Index]) {
                    array1[counter] = array2[array2Index--];
                } else {
                    array1[counter] = array1[array1Index--];
                }

            }
            counter--;
        }



        return array1;
    }




    public static void main(String[] args) {


        int [] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = new int[]{2,5,6};
        int n = 3;




     /*   int [] nums1 = new int[]{0};
        int m = 0;
        int [] nums2 = new int[]{1};
        int n = 1;*/
        System.out.println(mergeSortedArray(nums1, m, nums2, n));
        /*
        Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
         */
    }
}
