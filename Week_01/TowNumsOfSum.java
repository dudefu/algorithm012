package Week_01;

/**
 * 
 * 二叉树的最近公共祖先
 */
public class TowNumsOfSum {

    public static void main(String[] args) {
        // int[] nums = {2, 7, 11, 15} ;
        // int[] nums = {1, 2, 11, 15,7,0} ;
        int[] nums = {1,2,3,4,5,6,7} ;
        int target = 3 ;
        int[] indexs = twoSum(nums, target) ;
        System.out.println(indexs[0]+","+indexs[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] returnIndexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target ) {
                    returnIndexs[0] = i ;
                    returnIndexs[1] = j ;
                }
            }
        }
        return returnIndexs;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}