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
    public ListNode mergeNodes(ListNode head) {
        ListNode left=head.next;
        ListNode rigth=head.next;
        while(rigth!=null){
            int count=0;
            while(rigth.val!=0){
                count+=rigth.val;
                rigth=rigth.next;
            }
            left.val=count;
            rigth=rigth.next;
            left.next=rigth;
            left=left.next;
        }
        return head.next;
    }
}