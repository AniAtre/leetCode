package linkedList;
/**
* Problem Statement:
* Given a linked list, remove the n-th node from the end of list and return its head.
*
* Example:
* Given linked list: 1->2->3->4->5, and n = 2.
* After removing the second node from the end, the linked list becomes 1->2->3->5.
*
* Note:
* Given n will always be valid.
*
* Follow up:
* Could you do this in one pass?
*
* Corner Use Cases:
* 1->2->3->4->5, and n = 2.
* 1->2 and n = 1
* 1->2 and n = 2
* 1 and n = 1
* 1->2->3 and n = 3
* 1->2->3 and n = 2
* 1->2->3 and n = 1
*
* Definition for singly-linked list.
* public class ListNode {
*   int val;
*   ListNode next;
*   ListNode(int x) { val = x; }
* }
*/
import shared.ListNode;

public class RemoveNthNodeFromEndSLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        int len = 1;
        ListNode fastPtr = head, slowPtr = head, slowestPtr = head;
        for(int i = 0; i < n-1; i++){
            fastPtr = fastPtr.next;
        }
        while(fastPtr.next != null){
            if(len != 1){
                slowestPtr = slowestPtr.next;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
            len++;
        }
        // if we are deleing the head itself
        if(slowPtr == head){
            head = head.next;
        }
        /* if we are deleting last node, then we need access to second last node, so
         we need second last node pointer as well
        */
        if(slowPtr == fastPtr){
            slowestPtr.next = null;
        }
        deleteNode(slowPtr);
        return head;
    }

    public void deleteNode(ListNode node){
        if(node.next == null){
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}