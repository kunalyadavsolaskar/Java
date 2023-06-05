class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution_4 {
    public static TreeNode str2tree(String s) {
        if (s.isEmpty()) {
            return null;
        }

        // Find the value of the root node
        int i = 0;
        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '-')) {
            i++;
        }
        int rootVal = Integer.parseInt(s.substring(0, i));
        TreeNode root = new TreeNode(rootVal);

        // Check if there are any children
        if (i >= s.length()) {
            return root;
        }

        // Find the substring representing the left child
        int start = i;
        int count = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }

            if (count == 0) {
                break;
            }

            i++;
        }
        String leftSubtree = s.substring(start + 1, i);

        // Find the substring representing the right child
        String rightSubtree = "";
        if (i + 2 < s.length()) {
            rightSubtree = s.substring(i + 2, s.length() - 1);
        }

        // Recursively construct the left and right subtrees
        root.left = str2tree(leftSubtree);
        root.right = str2tree(rightSubtree);

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";

        TreeNode root = str2tree(s);
        inorderTraversal(root);
    }
}
