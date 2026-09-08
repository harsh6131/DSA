class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode medList = new ListNode(0);
        ListNode head = medList;

        while (temp1 != null && temp2 != null) {

            if (temp1.val < temp2.val) {
                medList.next = temp1;
                temp1 = temp1.next;
            } 
            else {
                medList.next = temp2;
                temp2 = temp2.next;
            }

            medList = medList.next;
        }

        while (temp1 != null) {
            medList.next = temp1;
            temp1 = temp1.next;
            medList = medList.next;
        }

        while (temp2 != null) {
            medList.next = temp2;
            temp2 = temp2.next;
            medList = medList.next;
        }

        return head.next;
    }
}