import java.util.ArrayList;

public class BinaryTree {


    private int size;
    private BinaryTreeNode root;

    public BinaryTree()
    {
        size = 0;
        root = null;
    }
    protected void increaseSize()
    {
        size++;
    }
    public int size()
    {
        return size;
    }

    public BinaryTreeNode getRoot()
    {
        return root;
    }

    protected void setRoot(BinaryTreeNode root)
    {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    public boolean contains(int element)
    {
        BinaryTreeNode node = root;
        while(node!=null) {

            if (node.getElement() == element ) {
                return true;
            } else if (element > node.getElement())
            {
                node = node.getRightChild();
            }
            else
            {
                node= node.getLeftChild();
            }

        }
        return false;
    }

    public ArrayList inOrder(){
        ArrayList<BinaryTreeNode>list=new ArrayList<>();








    }



























}
