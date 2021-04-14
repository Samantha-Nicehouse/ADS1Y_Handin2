public class BinaryTreeNode {

   private int element;
   private BinaryTreeNode leftChild;
   private BinaryTreeNode rightChild;


    public BinaryTreeNode(int element){
            this.element = element;
            leftChild = null;
            rightChild= null;
    }

    public BinaryTreeNode(){
        this.element = Integer.MIN_VALUE;
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


    public void addLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }


}
