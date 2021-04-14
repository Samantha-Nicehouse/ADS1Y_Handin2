import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}