package jianzhi;

import jianzhi.data.TreeLinkNode;

/**
 * 二叉树的下一个节点
 */
public class GetNext {
    /**
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode nextNode = null;
        if (pNode == null) {
            return null;
        }
        //如果右节点不为空，下一个节点则为右节点最左边的子节点
        if (pNode.right != null) {
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left != null) {
                rightNode = rightNode.left;
            }
            nextNode = rightNode;
        }
        //如果父节点不为空
        else if (pNode.next != null) {
            //若该节点为父节点的左节点，则下个节点为父节点
            if (pNode == pNode.next.left) {
                nextNode = pNode.next;
            }
            //若该节点为父节点的右节点
            else {
                TreeLinkNode parentNode = pNode.next;
                while (parentNode != null) {
                    //
                    if (parentNode.next != null && parentNode == parentNode.next.left) {
                        nextNode = parentNode.next;
                        parentNode = null;
                    }
                    //
                    else {
                        parentNode = parentNode.next;
                    }
                }
            }
        }
        return nextNode;
    }
}
