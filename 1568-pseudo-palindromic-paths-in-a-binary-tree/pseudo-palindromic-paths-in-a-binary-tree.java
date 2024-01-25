/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int pseudoPalindromicPaths(TreeNode root) {
    if (root == null) {
        return 0;
    }
    return doDFS(root, new HashMap<>());
}

private static int doDFS(TreeNode root, HashMap<Integer, Integer> hm) {
    if (root == null) {
        return 0;
    }

    // Create a new HashMap for each recursive call to avoid unintended modifications
    HashMap<Integer, Integer> newHm = new HashMap<>(hm);
    newHm.put(root.val, newHm.getOrDefault(root.val, 0) + 1);

    if (root.left == null && root.right == null) {
        int oddCount = 0;
        for (int count : newHm.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        // If at most one digit has an odd count, the path is pseudo-palindromic
        return oddCount <= 1 ? 1 : 0;
    }

    int result = 0;
    result += doDFS(root.left, newHm);
    result += doDFS(root.right, newHm);

    return result;
}

}