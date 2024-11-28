package lc_top150;

import java.util.Arrays;

public class LC88_MergeSortedArray_SA {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergeSortedArray(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
        System.out.println(Arrays.toString(mergeSortedArray(new int[]{1}, 1, new int[]{}, 0)));

    }

    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){

        int lastIndex = nums1.length-1;

        while(n >0 && m >=0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[lastIndex--] = nums2[n-1];
                n--;
            }else{
                nums1[lastIndex--] = nums1[m-1];
                m--;
            }
        }

        while(n >0 && lastIndex >=0){
            nums1[lastIndex--] = nums2[n-1];
            n--;
        }
        while(m > 0 && lastIndex >=0){
            nums1[lastIndex--] = nums1[m-1];
            m--;
        }
        return nums1;
    }
}
