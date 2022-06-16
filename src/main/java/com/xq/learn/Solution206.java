package com.xq.learn;

/**
 * reverse linked list
 * @author easonlzhang
 */
public class Solution206 {

    /**
     * 使用迭代实现链表的翻转
     * @param head head
     * @return new linked list
     */
    public static ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode prev = null;
        while (null != head) {
            ListNode temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;

        }

        return prev;
    }

    public static ListNode recursivelyReverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode newHead = recursivelyReverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}