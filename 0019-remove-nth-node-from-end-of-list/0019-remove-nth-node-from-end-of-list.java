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
        int count = 0;
        ListNode i = head;
        while(i != null){
            count++;
            i = i.next;
        }

        if(count == n)
        {
            return head.next;
        } 
        ListNode temp = head;
        for(int j=1;j<count-n;j++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;

        
    }
}