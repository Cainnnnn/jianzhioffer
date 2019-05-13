package jianzhi;


import jianzhi.data.TreeNode;

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre == null || in == null || pre.length != in.length) return null;
        TreeNode root = handleTreeNode(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode handleTreeNode(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > pre.length - 1 || preEnd > pre.length - 1 || preStart > preEnd) return null;
        if (inStart > in.length - 1 || inEnd > in.length - 1 || inStart > inEnd) return null;
        if (preStart == preEnd) return new TreeNode(pre[preStart]);
        if (inStart == inEnd) return new TreeNode(in[inStart]);
        TreeNode root = new TreeNode(pre[preStart]);
        int inRootPos = -1;
        for (int i = inStart, max = inEnd; i <= max; i++) {
            if (in[i] == pre[preStart]) {
                inRootPos = i;
            }
        }
        root.left = handleTreeNode(pre, preStart + 1, preStart + inRootPos - inStart, in, inStart, inRootPos - 1);
        root.right = handleTreeNode(pre, preStart + inRootPos - inStart + 1, preEnd, in, inRootPos + 1, inEnd);
        return root;
    }
}
