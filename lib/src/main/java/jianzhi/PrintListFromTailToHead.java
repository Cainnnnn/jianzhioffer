package jianzhi;

import jianzhi.data.ListNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    /**
     @param listNode
     @return
     使用栈实现的方法
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) return list;
        Stack<ListNode> stack = new Stack<>();
        stack.push(listNode);
        while (listNode.next != null) {
            stack.push(listNode.next);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            ListNode node = stack.pop();
            if (node != null) {
                list.add(node.val);
            }
        }
        return list;
    }

    /**
     @param listNode
     @return
     使用递归实现
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        tailToHead(listNode, list);
        return list;
    }

    public void tailToHead(ListNode node, ArrayList<Integer> list) {
        if (node == null || list == null) return;
        if (node.next != null) {
            tailToHead(node.next, list);
        }
        list.add(node.val);
    }
}
