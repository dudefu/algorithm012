package Week_02;

public class BuildTreeDemo {


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return dfs(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);

    }
 
    public TreeNode dfs(int ps, int pe, int is, int ie, int[] preorder, int[] inorder) {
        if (ps > pe) return null;
        TreeNode r = new TreeNode(preorder[ps]);
        int mid = -1;
        for (int i = 0; i <= ie; i++) {
            if (inorder[i] == preorder[ps]) {
                mid = i;
                break;
            }
        }
        if (mid == -1) return null;
        //左子树的个数
        //前序遍历[ps][ps+1...ps+c][ps+c+1...pe]
        //后序遍历[is...mid-1][mid][mid+1...ie]
        int c = mid - is;
        r.left = dfs(ps + 1, ps + c, is, mid - 1, preorder, inorder);
        r.right = dfs(ps + c + 1, pe, mid + 1, ie, preorder, inorder);
        return r;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}