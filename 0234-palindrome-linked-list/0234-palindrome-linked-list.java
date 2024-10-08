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
    public boolean isPalindrome(ListNode head) {
     //First -> ArrayList
     //Second -> Stack
     //anotherLindedList ->
     //reverse the second half
     ListNode slow = head;
     ListNode fast = head;
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
     }   
     ListNode prev = null;
     while(slow != null){
        ListNode next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
     }
     while(prev != null){
        if(prev.val != head.val) return false;
        prev = prev.next; head = head.next;

     }
     return true;
    }
}