public class LevelCount {
    public int count(TreeNode t, int level) {
        // Execution
        // base case: if t == null return 0;
        if(t==null) return 0;

        // if we reach the last level return 1 (counting the leaf as one)
        if(level == 0) return 1;

        // return count of the left + right, decreasing level by one each fow of nodes that we pass
        return count(t.right, level - 1) + count(t.left, level - 1);




    }
}