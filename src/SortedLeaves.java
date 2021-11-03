import java.util.ArrayList;

public class SortedLeaves {
    public void doWork(TreeNode tree){
        if(tree == null) return;

        if(tree.left == null && tree.right == null){
            myList.add("" + ((char)tree.info));
        } else {
            doWork(tree.left);
            doWork(tree.right);
        }
    }

    public String[] values(TreeNode tree) {
        // create myList
        ArrayList<String> myList = new ArrayList<>();

        doWork(tree);

        return myList.toArray(new String[myList.size()]);
    }
}