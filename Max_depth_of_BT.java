public class Max_depth_of_BT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

    
        int depth = maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh,rh);
    }
}
