public class test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(35);
        BinaryTreePrint print = new BinaryTreePrint();
        //print.printTree(tree.getRoot());

        tree.rebalance();

        //print.printTree(tree.getRoot());

        tree.removeElement(30);
        //System.out.println("REMOVED 30......");
        //print.printTree(tree.getRoot());
        //System.out.println("REBALANCE....");
        tree.rebalance();
        print.printTree(tree.getRoot());

    }
}
