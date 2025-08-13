import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    private void dfs(TreeNode node, int remaining, List<Integer> path, List<List<Integer>> res) {
        if (node == null) return;

        path.add(node.val);
        remaining -= node.val;

        // Check if it's a leaf and the sum matches
        if (node.left == null && node.right == null && remaining == 0) {
            res.add(new ArrayList<>(path)); // copy the current path
        }

        dfs(node.left, remaining, path, res);
        dfs(node.right, remaining, path, res);

        path.remove(path.size() - 1); // backtrack
    }
}
