package LeetCode;

import TeluskoCourse.linkedlists.Node;

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public static void reverseList(ListNode head) {

        ListNode node = head.next;

        while (node.next != null){
            node = head.next;
        }

        while (head.next != null){
            head = head.next;
        }

        head.next = node;





    }
}
