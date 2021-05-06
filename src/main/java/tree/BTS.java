package tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author hui
 * 2019/5/23 0023 17:27
 * <p>
 * 二叉查找树
 */
public class BTS {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getKey(int key) {
        return getKey(root, key);
    }

    private TreeNode getKey(TreeNode node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.getId()) {
            return getKey(node.getLeftChild(), key);
        } else if (key > node.getId()) {
            return getKey(node.getRightChild(), key);
        } else {
            return node;
        }
    }

    public void putKey(int key) {
        root = putKey(root, key);
    }

    private TreeNode putKey(TreeNode node, int key) {
        if (node == null) {
            return new TreeNode(key);
        }
        if (key < node.getId()) {
            node.setLeftChild(putKey(node.getLeftChild(), key));
        } else if (key > node.getId()) {
            node.setRightChild(putKey(node.getRightChild(), key));
        } else {
            node.setId(key);
        }
        return node;
    }


    public static void preOrderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.getId());
        preOrderTree(node.getLeftChild());
        preOrderTree(node.getRightChild());

    }

    public static void inOrderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTree(node.getLeftChild());
        System.out.print(" " + node.getId());
        inOrderTree(node.getRightChild());

    }

    public static void postOrderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTree(node.getLeftChild());
        postOrderTree(node.getRightChild());
        System.out.print(" " + node.getId());

    }

    public static void main(String[] args) {
        int[] keys = {5, 6, 4, 8, 2, 3, 1, 9, 7, 0};

        BTS bts = new BTS();
        for (int key : keys) {
            bts.putKey(key);
        }
        System.out.println("先序遍历:");
        preOrderTree(bts.getRoot());
        System.out.println();

        System.out.println("中序遍历:");
        inOrderTree(bts.getRoot());
        System.out.println();

        System.out.println("后序遍历:");
        postOrderTree(bts.getRoot());
        System.out.println();
    }

}
