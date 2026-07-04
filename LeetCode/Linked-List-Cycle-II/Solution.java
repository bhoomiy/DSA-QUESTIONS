1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16
17        while(fast!=null && fast.next!=null){
18            slow=slow.next;
19            fast=fast.next.next;
20            
21            if(slow==fast) {
22                ListNode ptr=head;
23                while(ptr!=slow){
24                    ptr=ptr.next;
25                    slow=slow.next;
26                }
27                return ptr;
28            }
29        }
30        return null;
31    }
32}