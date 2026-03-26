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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        cur=head;
        if(count==n){
            head=head.next;
            return head;
        }
        for(int i=1;i<(count-n);i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;



    return head;
    }
}