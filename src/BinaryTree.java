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


    public ArrayList<BinaryTreeNode> inOrder(){

        ArrayList<BinaryTreeNode> list=new ArrayList();
        inOrderTraversal(root,list);
        if (list.isEmpty()){
            return null;
        }
        return list;
    }

    public ArrayList<BinaryTreeNode> preOrder(){

        ArrayList<BinaryTreeNode> list=new ArrayList();
        preOrderTraversal(root,list);
        if (list.isEmpty()){
            return null;
        }
        return list;
    }

    public ArrayList<BinaryTreeNode> postOrder(){

        ArrayList<BinaryTreeNode> list=new ArrayList();
        postOrderTraversal(root,list);
        if (list.isEmpty()){
            return null;
        }
        return list;
    }


    public ArrayList<BinaryTreeNode> levelOrder(){

        ArrayList<BinaryTreeNode> list=new ArrayList();

        int height=height();
        for (int i=0;i<height;i++){
            levelOrderTraversal(root,list,i);
        }
        return levelOrder();

    }



    private void levelOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list,int no){

        if (node!=null)
        {
            levelOrderTraversal(node.getLeftChild(),list,no);
            levelOrderTraversal(node.getRightChild(),list,no);

        }
    }

    public int height(){
        if (isEmpty())
        {
            return -1;
        }
        else{
            return getHeight(root);
        }
    }


    private int getHeight(BinaryTreeNode node){
        if (node==null)
        {
            return -1;
        }
        else{
            int heightL=getHeight(node.getLeftChild());
            int heightR=getHeight(node.getRightChild());
            if (heightL>heightR)
                return heightL+1;
            else if (heightL<heightR){
                return heightR+1;
            }
            else return heightL+1;
        }
    }


    private void inOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list){

        if (node!=null)
        {

            inOrderTraversal(node.getLeftChild(),list);
            list.add(node);
            inOrderTraversal(node.getRightChild(),list);
        }

    }


    private void preOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list){

        if (node!=null)
        {
            list.add(node);
            preOrderTraversal(node.getLeftChild(),list);
            preOrderTraversal(node.getRightChild(),list);
        }

    }


    private void postOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list){

        if (node!=null)
        {
            postOrderTraversal(node.getLeftChild(),list);
            postOrderTraversal(node.getRightChild(),list);
            list.add(node);
        }

    }
























































}
