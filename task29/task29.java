package task29;

public class task29 {
    static class Treenode {
        int value;
        Treenode left;
        Treenode right;

        Treenode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class Solution {
        int target;

        public boolean hasPathSum(Treenode root, int targetSum) {
            if (root == null) {
                return false;
            }
            target = targetSum;
            return helper(root, 0);
        }

        private boolean helper(Treenode root, int sum) {
            if (root == null) {
                return false;
            }

            sum += root.value;
            if (root.left == null && root.right == null) {
                return sum == target;
            }

            boolean left = helper(root.left, sum);
            boolean right = helper(root.right, sum);
            return left || right;
        }
    }

    public static void main(String[] args) {
        Treenode root = new Treenode(5);
        root.left = new Treenode(4);
        root.right = new Treenode(8);

        root.left.left = new Treenode(11);
        root.left.left.left = new Treenode(7);
        root.left.left.right = new Treenode(2);

        root.right.left = new Treenode(13);
        root.right.right = new Treenode(4);
        root.right.right.right = new Treenode(1);

        Solution solution = new Solution();

        int targetSum1 = 22;
        System.out.println("Has path sum " + targetSum1 + "? " + solution.hasPathSum(root, targetSum1));

        int targetSum2 = 100;
        System.out.println("Has path sum " + targetSum2 + "? " + solution.hasPathSum(root, targetSum2));
    }
}
