package com.xq.learn;

/**
 * swap nodes in pairs
 * 1 -> 2 -> 3 -> 4
 *        |
 * 2 -> 1 -> 4 -> 3
 * @author easonlzhang
 */
public class Solution24 {
    /**
     * 使用递归翻转相邻的两个链表
     * @param head head
     * @return new head
     */
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode prev = head.next;
        head.next = swapPairs(head.next.next);
        prev.next = head;

        return prev;
    }
}
