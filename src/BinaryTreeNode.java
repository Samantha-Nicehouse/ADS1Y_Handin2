public class BinaryTreeNode {

   private int element;
   private BinaryTreeNode leftChild;
   private BinaryTreeNode rightChild;


    public BinaryTreeNode(){
            leftChild = null;
            rightChild= null;
    }

    public BinaryTreeNode(int element, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChld(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }




}
