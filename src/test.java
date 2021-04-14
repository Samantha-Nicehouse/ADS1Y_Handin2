public class test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();


        tree.insert(6);
        tree.insert(2);
        tree.insert(1);
        tree.insert(10);
        tree.insert(13);
        tree.insert(12);
        tree.insert(19);
        tree.insert(25);
        tree.insert(22);
        BinaryTreePrint print = new BinaryTreePrint();
        //print.printTree(tree.getRoot());





        //tree.removeElement(30);
        //System.out.println("REMOVED 30......");
        //print.printTree(tree.getRoot());
        //System.out.println("REBALANCE....");
        tree.rebalance();
        print.printTree(tree.getRoot());

    }
}
