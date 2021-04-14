import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
   BinarySearchTree tree;

   @BeforeEach
   void init()
   {
       tree = new BinarySearchTree();
   }
    @Test
    void insertOne() {
       tree.insert(12);
       assertTrue(tree.contains(12));
    }


    @Test
    void removeElement() {
       tree.insert(12);
       tree.removeElement(12);
       assertFalse(tree.contains(12));
    }

    @Test
    void findMin() {
       tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        assertEquals(5,tree.findMin().getElement());
    }

    @Test
    void findMax() {
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        assertEquals(7,tree.findMax().getElement());
    }


    @Test
    void rebalance() {
       ArrayList<BinaryTreeNode> list=new ArrayList<>();
        list.add(new BinaryTreeNode(12));
        list.add(new BinaryTreeNode(2));
        list.add(new BinaryTreeNode(19));
        list.add(new BinaryTreeNode(1));
        list.add(new BinaryTreeNode(6));
        list.add(new BinaryTreeNode(13));
        list.add(new BinaryTreeNode(22));
        list.add(new BinaryTreeNode(10));
        list.add(new BinaryTreeNode(25));

        tree.insert(6);
        tree.insert(2);
        tree.insert(1);
        tree.insert(10);
        tree.insert(13);
        tree.insert(12);
        tree.insert(19);
        tree.insert(25);
        tree.insert(22);
        tree.rebalance();
        for(BinaryTreeNode node : list){
            assertEquals(node.getElement(),tree.levelOrder().get(list.indexOf(node)).getElement());
        }
    }

}