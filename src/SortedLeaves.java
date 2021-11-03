import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedLeaves {
    ArrayList<String> myList;

    public SortedLeaves(){
        myList = new ArrayList<>();
    }

    public ArrayList<String> getList(){
        return this.myList;
    }

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
        //ArrayList<String> myList = new ArrayList<>();

        doWork(tree);

        String[] ret = getList().toArray(new String[myList.size()]);
        Arrays.sort(ret);

        return ret;
    }
}