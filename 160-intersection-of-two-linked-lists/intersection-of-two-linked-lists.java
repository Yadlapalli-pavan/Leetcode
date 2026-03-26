/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0;
        int count2=0;
        ListNode cur1=headA;
        ListNode cur2=headB;
        while(cur1!=null){
            count1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            count2++;
            cur2=cur2.next;
        }
        
        cur1=headA;
        cur2=headB;
        if(count1>count2){
            for(int i=0;i<count1-count2;i++){
                cur1=cur1.next;
            }
        }
        else{
            for(int i=0;i<count2-count1;i++){
                cur2=cur2.next;
            }
        }
        while(cur1!=null && cur2!=null){
            if(cur1==cur2){
                return cur1;
            }
            else{
                cur1=cur1.next;
                cur2=cur2.next;
            }
        }
        return null;
    }
}