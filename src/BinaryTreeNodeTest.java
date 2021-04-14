import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest {

    @Test
    void getElement() {
      BinaryTreeNode node =   new BinaryTreeNode(10);
        assertEquals(10,node.getElement());
    }

    @Test
    void setElement() {
        BinaryTreeNode node =   new BinaryTreeNode();
        node.setElement(10);
        assertEquals(10, node.getElement());
    }

    @Test
    void getLeftChild() {
        BinaryTreeNode node =   new BinaryTreeNode(10);
        node.addLeftChild(new BinaryTreeNode(5));
        assertEquals(5, node.getLeftChild().getElement());
    }

    @Test
    void addLeftChild() {
        BinaryTreeNode node =   new BinaryTreeNode(10);
        node.addLeftChild(new BinaryTreeNode(7));
        assertEquals(7,node.getLeftChild().getElement());
    }

    @Test
    void addRightChild() {
        BinaryTreeNode node =   new BinaryTreeNode(10);
        node.addRightChild(new BinaryTreeNode(15));
        assertEquals(15,node.getRightChild().getElement());
    }

    @Test
    void getRightChild() {
        BinaryTreeNode node =   new BinaryTreeNode(10);
        node.addRightChild(new BinaryTreeNode(20));
        assertEquals(20, node.getRightChild()
        .getElement());

    }
}