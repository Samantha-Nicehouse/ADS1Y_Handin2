import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree {

    int element;
    BinaryTreeNode binaryTreeNode;

    public BinarySearchTree(){

    }

    public void insert(int element){
       setRoot(insert(getRoot(), element));
       increaseSize();
    }

    private BinaryTreeNode insert(BinaryTreeNode root, int element ){

        if (root == null)
        {
            root = new BinaryTreeNode(element);
            return root;
        }

        else if (element < root.getElement())
        { root.addLeftChild(insert(root.getLeftChild(), element));}

        else if (element > root.getElement()){
            root.addRightChild(insert(root.getRightChild(), element));
        }
        return root;
    }

    public void removeElement(int element){
        setRoot(removeElement(getRoot(),element));
        decreaseSize();
    }

    private BinaryTreeNode removeElement(BinaryTreeNode root, int element)
    {
        if (root == null)
            return root;

        if (element < root.getElement())
            root.addLeftChild(removeElement(root.getLeftChild(), element));
        else if (element > root.getElement())
            root.addRightChild(removeElement(root.getRightChild(), element));

        else {
            if (root.getLeftChild() == null)
                return root.getRightChild();
            else if (root.getRightChild() == null)
                return root.getRightChild();

            root.setElement(findMin(root.getRightChild()));

            root.addRightChild(removeElement(root.getRightChild(),root.getElement()));
        }

        return root;
    }

   public BinaryTreeNode findMin(){
        BinaryTreeNode root = getRoot();
       while(root.getLeftChild() != null){
           root = root.getLeftChild();
       }
       return root;
   }
    public BinaryTreeNode findMax(){
        BinaryTreeNode root = getRoot();
        while(root.getRightChild() != null){
            root = root.getRightChild();
        }
        return root;
    }
   private int findMin(BinaryTreeNode root){
        int min = root.getElement();
        while(root.getLeftChild() != null){
            min = root.getLeftChild().getElement();
            root = root.getLeftChild();
        }
        return min;
   }

    public void rebalance()
    {
        ArrayList<BinaryTreeNode> order = inOrder();
        setRoot(balanceTree(order,0,order.size()-1));
    }
    private BinaryTreeNode balanceTree(ArrayList<BinaryTreeNode> nodes, int start, int end)
    {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        BinaryTreeNode node = nodes.get(mid);

        node.addLeftChild(balanceTree(nodes,start,mid-1));
        node.addRightChild(balanceTree(nodes,mid+1,end));
        return node;
    }
}
