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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode lres = head;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int sum = l1Val + l2Val + carry;

            int digit = sum % 10;
            carry = sum / 10;

            lres.next = new ListNode(digit);

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;

            lres = lres.next;
        }

        if (carry > 0) {
            lres.next = new ListNode(carry);
        }

        return head.next;
    }
}