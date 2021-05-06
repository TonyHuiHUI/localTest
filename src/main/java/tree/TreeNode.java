package tree;

/**
 * @author hui
 * 2019/5/23 0023 17:06
 */
public class TreeNode {
    private int id;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int id) {
        this.id = id;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}