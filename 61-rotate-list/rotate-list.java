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
        if (head==null){
            return head;
        }
        ListNode cur=head;
        int count=1;
        while(cur.next!=null){
            count++;
            cur=cur.next;
        }
        cur.next=head;
        cur=head;
        k=k%count;
        int pos=count-k;
        for(int i=1;i<pos;i++){
            cur=cur.next;
        }
        ListNode next=cur.next;
        cur.next=null;
        ListNode newHead=next;


        

    return newHead;
    }
}