public class BinarySearchTree extends BinaryTree {

    int element;
    BinaryTreeNode binaryTreeNode;

    public BinarySearchTree(){

    }

    public void insert(int element){
       setRoot(insert(getRoot(), element));

    }

    public BinaryTreeNode insert(BinaryTreeNode root, int element ){

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
        setRoot(remove(getRoot(),element));
    }

    public BinaryTreeNode removeElement(BinaryTreeNode root, int element)
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

            root.setElement(minValue(root.getRightChild()));

            root.addRightChild(removeElement(root.getRightChild(),root.getElement()));
        }

        return root;
    }

   public int findMin(int element){

   }
}
