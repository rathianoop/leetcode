package lc_top150;

import java.util.Arrays;

public class LC88_MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        mergeArray(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeArray(int[] nums1, int m, int[] nums2, int n ){

        int mCounter = m-1;
        int nCounter = n-1;
        int counter = m+n-1;

        while(counter >=0){
            if(mCounter >=0 && nCounter >=0){
                if(nums2[nCounter] > nums1[mCounter]){
                    nums1[counter] = nums2[nCounter];
                    nCounter--;
                }else{
                    nums1[counter] = nums1[mCounter];
                    mCounter--;
                }
            }else if(mCounter >=0){
                nums1[counter] = nums1[mCounter];
                mCounter--;
            }else{
                nums1[counter] = nums2[nCounter];
                nCounter--;
            }

            counter--;
        }

    }
}
