import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest{
    BinarySearchTree tree;
    ArrayList<BinaryTreeNode> list = new ArrayList<>();
    @BeforeEach
    void setUp(){
        tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(6);
        tree.insert(2);
        tree.insert(10);
        tree.insert(13);
        tree.insert(12);
        tree.insert(19);
        tree.insert(25);
        tree.insert(22);
        list = new ArrayList<>();
        list.add(new BinaryTreeNode(1));
        list.add(new BinaryTreeNode(2));
        list.add(new BinaryTreeNode(6));
        list.add(new BinaryTreeNode(10));
        list.add(new BinaryTreeNode(12));
        list.add(new BinaryTreeNode(13));
        list.add(new BinaryTreeNode(19));
        list.add(new BinaryTreeNode(22));
        list.add(new BinaryTreeNode(25));
    }
    @Test
    void inOrder(){
        for(BinaryTreeNode node : list){
            assertEquals(node.getElement(),tree.inOrder().get(list.indexOf(node)).getElement());
        }
    }
    @Test
    void notInOrder(){
        assertEquals(list.get(2).getElement(), tree.inOrder().get(1).getElement());
        assertEquals(list.get(2).getElement(), tree.inOrder().get(3).getElement());
        assertEquals(list.get(3).getElement(), tree.inOrder().get(3).getElement());
    }
}