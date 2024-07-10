package problems;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(insertPosition(new int[]{1,2,3,4,6,7,8,9,10,11,12,13,14,15}, 5));
        System.out.println(insertPosition(new int[]{1,2,5,6}, 5));
    }

    public static int insertPosition(int[] array, int target){

        int left = 0;
        int right = array.length-1;
        int pivot = 0;

        while(left <= right){
            pivot = left + (right-left)/2;

            if(array[pivot] == target) {
                return pivot;
            }

            if(array[pivot] > target){
                right = pivot-1;
            }
            if(array[pivot] < target){
                left = pivot+1;
            }
        }
        return left;

    }


}
