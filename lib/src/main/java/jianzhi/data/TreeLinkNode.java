package jianzhi.data;

public class TreeLinkNode {
    public int val;
    public TreeLinkNode left = null;
    public TreeLinkNode right = null;
    /**
     * 这里应该是parent
     */
    public TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
