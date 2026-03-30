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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur=list1;
        ListNode prev=list1;
        for(int i=1;i<a;i++){
            cur=cur.next;
        }
        for(int i=1;i<=b+1;i++){
            prev=prev.next;
        }
        cur.next=list2;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=prev;

        return list1;
    }
}