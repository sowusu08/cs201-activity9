public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // APPROACH
        // base case: if the node is null return 0

        // set rsum to tree.info + hasPath(tree.right)
        // set lsum to tree.info + hasPath(tree.left)

        // if rsum == value or lsum == value return 1
        // otherwise return 1


        // EXECUTION
        // base case: if the node is null return 0
        if(tree == null) return 0;

        // set rsum to tree.info + hasPath(tree.right)
        int rsum = tree.info + hasPath(target, tree.right);
        // set lsum to tree.info + hasPath(tree.left)
        int lsum = tree.info + hasPath(target, tree.left);

        // if rsum == value or lsum == value return 1
        if(rsum == target || lsum == target) return 1;
        return 0;
        // otherwise return 0
    }
}
