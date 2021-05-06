package tree;

import java.util.TreeMap;

/**
 * @author hui
 * 2019/5/23 0023 18:07
 * <p>
 * 红黑树
 */
public class RBTreeNode {
    private int id;
    private RBTreeNode parent;
    private RBTreeNode leftChild;
    private RBTreeNode rightChild;
    /**
     * 1表示红。0表示黑
     */
    private int color;

    /**
     * 节点默认为红色
     */
    public RBTreeNode(int id) {
        this.id = id;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
        this.color = 1;
    }

    public RBTreeNode getParent() {
        return parent;
    }

    public void setParent(RBTreeNode parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RBTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(RBTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public RBTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(RBTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
