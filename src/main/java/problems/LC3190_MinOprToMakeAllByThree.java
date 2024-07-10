package problems;

public class LC3190_MinOprToMakeAllByThree {

    public int minimumOperations(int[] nums) {

        int counter = 0;
        for(int num : nums){
            System.out.println(num+ " 1st "+num/3);
        if(num/3 !=0) continue;
        if((num-1)/3 == 0 || (num+1)/3==0)
            System.out.println(num/3);
                counter++;
        }

        System.out.println("here"+5/3);
        System.out.println("here"+7%3);
        System.out.println("here"+6%3);

        return counter;

    }

    public static void main(String[] args) {
        LC3190_MinOprToMakeAllByThree lc3190MinOprToMakeAllByThree = new LC3190_MinOprToMakeAllByThree();
        int[] array = new int[]{1,2,3,4};
        System.out.println(lc3190MinOprToMakeAllByThree.minimumOperations(array));
        int[] array2 = new int[]{3,6,9};
        System.out.println(lc3190MinOprToMakeAllByThree.minimumOperations(array2));
    }
}
