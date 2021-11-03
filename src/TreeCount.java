public class TreeCount {
    public int count(TreeNode tree) {
        // replace with working code
        // APPROACH
        // base case: if tree is null return 0;
        // otherwise call count() on root.left;
        // then call count() on root.right subtree
        // and return 1 + these values;

        // EXECUTION
        // base case: if tree is null return 0;
        if(tree == null) return 0;
        // otherwise call count() on root.left
        // otherwise call count() on root.right
        // and return 1 + these values;
        return 1 + count(tree.right) + count(tree.left);
    }
}