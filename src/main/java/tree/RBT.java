package tree;


import java.util.TreeMap;

/**
 * @author hui
 * 2019/5/24 0024 9:42
 * <p>
 * 红黑树
 */
public class RBT {
    private RBTreeNode root;

    public RBTreeNode getRoot() {
        return root;
    }

    public void insertNode(int key) {
        root = insertNode(root, key);
    }

    /**
     * 求节点node的后继
     */
    public RBTreeNode successor(RBTreeNode node) {
        if (node.getRightChild() != null) {
            return minimum(node.getRightChild());
        }
        RBTreeNode tmp = node.getParent();
        while (tmp != null && node.equals(tmp.getRightChild())) {
            node = tmp;
            tmp = node.getParent();
        }
        return tmp;
    }

    /**
     * 以节点node为根节点的，key值最小的节点
     */
    public RBTreeNode minimum(RBTreeNode node) {
        if (node == null || node.getLeftChild() == null) {
            return node;
        } else {
            return minimum(node.getLeftChild());
        }
    }

    /**
     * 删除节点X，存在三种情况：
     * case 1：节点X不存在子女，则直接修改其父节点的子女指针为NULL
     * case 2：节点X存在一个子女，则通过建立其父节点与其子女节点的连接来删除节点X
     * case 3：节点X存在两个子女，则通过删除其后继节点，然后使用期后继节点的内容代替节点X的内容
     */
    private RBTreeNode deleteNode(RBTreeNode node) {
        if (node == null) {
            return null;
        }
        RBTreeNode target;//标记需要删除的节点
        if (node.getLeftChild() == null || node.getRightChild() == null) {
            target = node;
        } else {
            target = successor(node);
        }
        RBTreeNode tmp;//标记目标节点的子节点
        if (target.getLeftChild() != null) {
            tmp = target.getLeftChild();
        } else {
            tmp = target.getRightChild();
        }
        tmp.setParent(target.getParent());

        if (target.getParent() == null) {//如果目标节点是根节点
            root = tmp;
        } else if (target.equals(target.getParent().getLeftChild())) {
            target.getParent().setLeftChild(tmp);
        } else {
            target.getParent().setRightChild(tmp);
        }
        if (!target.equals(node)) {//如果删除的是后继节点，将后继节点的Key赋值给原节点
            node.setId(target.getId());
        }

        if (target.getColor() == 0) {//如果目标节点是黑色，则会改变红黑树的性质，需要重新着色
            deleteColorNode(tmp);
        }
        return target;
    }

    private RBTreeNode insertNode(RBTreeNode node, int key) {
        if (node == null) {
            node = new RBTreeNode(key);
            if (getRoot() == null) {
                insertColorNode(node);
            }
            return node;
        }
        RBTreeNode newNode = null;
        if (key < node.getId()) {
            newNode = insertNode(node.getLeftChild(), key);
            node.setLeftChild(newNode);
            newNode.setParent(node);
        } else if (key > node.getId()) {
            newNode = insertNode(node.getRightChild(), key);
            node.setRightChild(newNode);
            newNode.setParent(node);
        } else {
            node.setId(key);
        }
        if (newNode != null) {
            newNode.setParent(node);
            insertColorNode(newNode);
        }
        return node;
    }


    public RBTreeNode searchNode(int key) {
        return searchNode(root, key);
    }

    private RBTreeNode searchNode(RBTreeNode node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.getId()) {
            return searchNode(node.getLeftChild(), key);
        } else if (key > node.getId()) {
            return searchNode(node.getRightChild(), key);
        } else {
            return node;
        }
    }
    /**
     * 删除节点后重新着色，如果节点X是红的或者根节点，只需要将节点X置为红色，否则存在四种情况：
     * case 1：节点X的兄弟节点是红色，则通过重新着色和旋转，转换成其他三种情况
     * case 2: 节点X的兄弟节点是黑色，同时兄弟节点的两个孩子节点都是黑色，则将兄弟节点置为红色，并将节点X上移
     * case 3: 节点X的兄弟节点是黑色，同时其左孩子节点是红色，右孩子节点是黑色，则通过重新着色和旋转，转换成第4中情况
     * case 4: 节点X的兄弟节点是黑色，同时其右孩子是红色。通过重新着色和旋转，对红黑树性质进行修复
     */
    private void deleteColorNode(RBTreeNode node) {
        while (!node.equals(root) && node.getColor() == 0) {
            if (node.equals(node.getParent().getLeftChild())) {//节点X是左孩子
                RBTreeNode broNode = node.getParent().getRightChild();
                if (broNode.getColor() == 1) {//case 1
                    broNode.setColor(0);
                    node.getParent().setColor(1);
                    leftRotate(node.getParent());
                    broNode = node.getParent().getRightChild();
                }
                if (broNode.getLeftChild().getColor() == 0 && broNode.getRightChild().getColor() == 0){//case 2
                    broNode.setColor(1);
                    node = node.getParent();
                }else if (broNode.getRightChild().getColor() == 0){//case 3
                    broNode.getLeftChild().setColor(0);
                    broNode.setColor(1);
                    rightRotate(broNode);
                    broNode = node.getParent().getRightChild();
                }
                broNode.setColor(node.getParent().getColor());//case 4
                node.getParent().setColor(0);
                broNode.getRightChild().setColor(0);
                leftRotate(node.getParent());
                node = root;
            } else {//节点X是右孩子
                RBTreeNode broNode = node.getParent().getLeftChild();
                if (broNode.getColor() == 1){
                    broNode.setColor(0);
                    node.getParent().setColor(1);
                    rightRotate(node.getParent());
                    broNode = node.getParent().getLeftChild();
                }
                if (broNode.getLeftChild().getColor() == 0&& broNode.getRightChild().getColor() == 0){
                    broNode.setColor(1);
                    node = node.getParent();
                }else if (broNode.getLeftChild().getColor() == 0){
                    broNode.getRightChild().setColor(0);
                    broNode.setColor(1);
                    leftRotate(broNode);
                    broNode = node.getParent().getLeftChild();
                }
                broNode.setColor(node.getParent().getColor());
                node.getParent().setColor(0);
                broNode.getRightChild().setColor(0);
                rightRotate(node.getParent());
                node = root;
            }
        }
        node.setColor(0);
    }

    /**
     * 新添加的孩子节点默认是红色，这会破坏点红黑树的性质。而唯一可能被破坏掉的性质是：
     * 1.根节点必须是黑色
     * 2.红色的节点的孩子必须是黑色
     * <p>
     * 给节点（记为X）着色一共存在6中情况，其中每3种情况相互对应（通过判断X的父节点是其祖父节点的左孩子还是右孩子而定）
     * 先分析X的父节点是其祖父节点的左孩子的情况：
     * case 1：X的叔叔节点是红色
     * 将X的父节点和叔叔节点都置为黑色，将X的祖父节点置为红色，并将祖父节点变成新的X节点
     * case 2：X的叔叔节点是黑色，且X是右孩子
     * 将以X的父节点为根，进行左旋转，变成case 3
     * case 3：X的叔叔节点是黑色，且X是左孩子
     * 将以X的祖父节点为根，进行右旋转
     */
    public void insertColorNode(RBTreeNode node) {
        if (node.getParent() == null) {
            node.setColor(0);
        } else {
            while (node.getParent().getColor() != 1) {
                if (node.getParent().equals(node.getParent().getParent().getLeftChild())) {//X的父节点是其祖父节点的左孩子
                    RBTreeNode ppRightNode = node.getParent().getParent().getRightChild();
                    if (ppRightNode.getColor() == 1) {//case 1
                        ppRightNode.setColor(0);
                        node.getParent().setColor(0);
                        node.getParent().getParent().setColor(1);
                        node = node.getParent().getParent();
                    } else if (node.equals(node.getParent().getRightChild())) {//case 2
                        node = node.getParent();
                        leftRotate(node);

                        node.getParent().setColor(0); //case 3
                        node.getParent().getParent().setColor(1);
                        rightRotate(node.getParent().getParent());
                    }
                } else {//X的父节点是其祖父节点的右孩子
                    RBTreeNode ppLeftNode = node.getParent().getParent().getLeftChild();
                    if (ppLeftNode.getColor() == 1) {
                        ppLeftNode.setColor(0);
                        node.getParent().setColor(0);
                        node.getParent().getParent().setColor(1);
                        node = node.getParent().getParent();
                    } else if (node.equals(node.getParent().getLeftChild())) {
                        node = node.getParent();
                        rightRotate(node);

                        node.getParent().setColor(0);
                        node.getParent().getParent().setColor(1);
                        leftRotate(node.getParent().getParent());
                    }
                }
            }
        }
    }

    private RBTreeNode leftRotate(RBTreeNode node) {
        /**
         * 原节点右子树的左孩子  ===>  原节点的右子树
         */
        RBTreeNode rNode = node.getRightChild();
        node.setRightChild(rNode.getLeftChild());
        rNode.getLeftChild().setParent(node);

        /**
         * 原节点父节点  ===>  新节点（原节点的右孩子）的父节点
         */
        rNode.setParent(node.getParent());
        if (node.getParent() != null) {
            if (node.getParent().getLeftChild().equals(node)) {
                node.getParent().setLeftChild(rNode);
            } else if (node.getParent().getRightChild().equals(node)) {
                node.getParent().setRightChild(rNode);
            }
        }
        /**
         * 原节点  ===>  新节点（原节点的右孩子）的左子树
         */
        rNode.setLeftChild(node);
        node.setParent(rNode);
        return rNode;
    }

    private RBTreeNode rightRotate(RBTreeNode node) {
        /**
         * 原节点左子树的右孩子  ===>  原节点的左子树
         */
        RBTreeNode lNode = node.getLeftChild();
        node.setLeftChild(lNode.getRightChild());
        lNode.getRightChild().setParent(node);

        /**
         * 原节点父节点  ===>  新节点（原节点的左孩子）的父节点
         */
        lNode.setParent(node.getParent());
        if (node.getParent() != null) {
            if (node.getParent().getLeftChild().equals(node)) {
                node.getParent().setLeftChild(lNode);
            } else if (node.getParent().getRightChild().equals(node)) {
                node.getParent().setRightChild(lNode);
            }
        }
        /**
         * 原节点  ===>  新节点（原节点的左孩子）的右子树
         */
        lNode.setRightChild(node);
        node.setParent(lNode);
        return lNode;
    }

}
