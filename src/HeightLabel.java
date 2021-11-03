public class HeightLabel {
    public int height(TreeNode root){
// if the root or the next node doesn't exist return 0 since there is no tree/height
        if(root == null) return 0;

// otherwise call height() on each subsequest node in the right and left subtrees (add 1 to what is returned each time) and return the maximum value
        return 1 + Math.max(height(root.right), height(root.left);
    }

    public TreeNode rewire(TreeNode t){
        // base case: if the node being evaluated doesn't exist, stop and return null
        if(t == null) return null;   // O(1)

        // otherwise create a new tree where the nodes have the values of their subtrees' maximum height
        // intially have the value of the node be 0
        // call rewire on all future nodes
        TreeNode ret = new TreeNode(0,
                rewire(t.left),          // T(n/2) or T(n - 1) (if tree is balanced vs unbalanced)
                rewire(t.right));        // T(n/2) or T(0) which equals O(1) (if tree is balanced vs unbalanced)

        // initialize left height and right height variables for the node
        int lh = 0;   // O(1)
        int rh = 0;   // O(1)

        // get the heights of each subtree (stored in the value of the nodes below the current node)
        if(ret.left != null) lh = ret.left.info;    // O(1)
        if(ret.right != null) rh = ret.right.info;  // O(1)

        // set the value of the current node to maximum of either lh or rh + 1
        ret.info = 1+ Math.max(rh, lh);             // O(1)
        return ret;
    }
}
