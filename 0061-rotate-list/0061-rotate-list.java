/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        k = k % n;
        if(k == 0){
            return head;
        }
        ListNode tail = temp;
        tail.next = head;
        int steps = n - k;
        ListNode curr = head;
        for (int i = 1; i < steps; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}