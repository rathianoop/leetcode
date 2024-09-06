package problems;

import java.util.Arrays;

public class LC88_MergeSortedArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergedArray(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));

    }

    public static int[] mergedArray(int[] nums1, int m, int[] nums2, int n){

        int counter = nums1.length-1;
        int nums1length = m-1;
        int nums2length = n-1;

        while(counter>=0) {

            if(nums1length < 0){
                nums1[counter] = nums2[nums2length--];
            }else if(nums2length < 0){
                nums1[counter] = nums1[nums1length--];
            }
            else {
                if (nums2[nums2length] > nums1[nums1length]) {
                    nums1[counter] = nums2[nums2length--];
                } else {
                    nums1[counter] = nums1[nums1length--];
                }
            }
            counter--;
        }

        return nums1;
    }


}
