package test.dataStructrue;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/26 16:17
 */
public class BinaryTree {

    // 根节点
    private TreeNode root;

    public BinaryTree(){
    }

    private BinaryTree(TreeNode root){
        this.root = root;
    }

    /**
     * @return 根节点
     * */
    public TreeNode getRoot(){
        return this.root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    private static class TreeNode{

        // 节点数据
        private String data = null;
        // 左节点的引用
        private TreeNode left = null;
        // 右节点的引用
        private TreeNode right = null;

        public TreeNode(){
        }

        public TreeNode(String data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public String getData() {
            return data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }
    }

    /**
     * @param
     * @return 父节点
     *
     * */
    public TreeNode getParent(TreeNode element){
        return (root == null || root == element) ? null : parent(root, element);
    }

    private TreeNode parent(TreeNode subTree, TreeNode element){
        if (subTree == null){
            return null;
        }
        if (subTree.getLeft() == element || subTree.getRight() == element){
            // 返回父节点地址
            return subTree;
        }
        TreeNode p;
        // 先在左子树中找， 如果左子树中没有找到，才到右子树去找
        if ((p = parent(subTree.getLeft(), element)) != null) {
            // 递归在左子树中搜索
            return p;
        }
        else {
            // 递归在右子树中搜索
            return parent(subTree.getRight(), element);
        }
    }
    /**
     * 节点个数
     *
     * @return
     */
    public int getSize(){
        return getNum(root);
    }

    private int getNum(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int i = getNum(node.getLeft());
            int j = getNum(node.getRight());
            return j + i + 1;
        }
    }
    /**
     * @return 树高度
     */
    public int getHeight(){
        return getHeight(root);
    }
    private int getHeight(TreeNode node){
        if(node == null){
            // 递归结束：孔数高度为0
            return 0;
        }else{
            int i = getHeight(node.getLeft());
            int j = getHeight(node.getRight());
            return  (i < j) ? (j + 1) : (i + 1);
        }
    }
    /**
     * 前序遍历
     * @param node
     */
    public void preOrder(TreeNode node){
        if (node != null){
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    /**
     * 中序遍历
     */
    public void inOrder(TreeNode node){
        if (node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());
        }
    }
    /**
     * 后序遍历
     */
    public void postOrder(TreeNode node){
        if (node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }

    public static void main(String[] args){
        TreeNode l12 = new TreeNode("left12",null,null);
        TreeNode r12 = new TreeNode("right12", null, null);
        TreeNode l22 = new TreeNode("left22", null, null);
        TreeNode r22 = new TreeNode("right22", null, null);

        // 根节点左子树
        TreeNode l1 = new TreeNode("left1", l12, r12);
        // 根节点右子树
        TreeNode r1 = new TreeNode("right1", l22, r22);
        // 创建根节点
        TreeNode root = new TreeNode("root", l1, r1);
        // 构建二叉树
        BinaryTree bt = new BinaryTree(root);

        System.out.println("-------------------先序遍历---------------");
        bt.preOrder(bt.getRoot());
        System.out.println("-------------------中序遍历---------------");
        bt.inOrder(bt.getRoot());
        System.out.println("-------------------后序遍历---------------");
        bt.postOrder(bt.getRoot());
        System.out.println("------------------------------------------");
        System.out.println(bt.getHeight());
        System.out.println(bt.getSize());
        System.out.println(bt.getParent(r22).getData());

    }


}
