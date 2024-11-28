package binarysearchtree;

public class LC108_ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        LC108_ConvertSortedArrayToBinarySearchTree tree = new LC108_ConvertSortedArrayToBinarySearchTree();
        TreeNode result = tree.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(result.val);
    }


    int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length-1);
    }

    private TreeNode helper(int left, int right){
        if(left > right){
            return null;
        }

        int center = (left+ right) /2;

        TreeNode node = new TreeNode(nums[center]);
        node.left = helper(left, center-1);
        node.right = helper(center+1, right);
        return node;
    }


}
