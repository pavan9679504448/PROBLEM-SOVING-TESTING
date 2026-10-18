package task30;

public class task30 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (root.equals(p) || root.equals(q)) {
                return root;
            }
            TreeNode lans = lowestCommonAncestor(root.left, p, q);
            TreeNode rans = lowestCommonAncestor(root.right, p, q);
            if (lans == null) {
                return rans;
            } else if (rans == null) {
                return lans;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n0 = new TreeNode(0);
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7);
        TreeNode n4 = new TreeNode(4);
        root.left = n5;
        root.right = n1;
        n5.left = n6;
        n5.right = n2;
        n1.left = n0;
        n1.right = n8;
        n2.left = n7;
        n2.right = n4;
        Solution sol = new Solution();
        TreeNode lca1 = sol.lowestCommonAncestor(root, n5, n1);
        System.out.println("LCA of 5 and 1: " + (lca1 != null ? lca1.val : "null")); // Output: 3
        TreeNode lca2 = sol.lowestCommonAncestor(root, n5, n4);
        System.out.println("LCA of 5 and 4: " + (lca2 != null ? lca2.val : "null"));
}
    }
