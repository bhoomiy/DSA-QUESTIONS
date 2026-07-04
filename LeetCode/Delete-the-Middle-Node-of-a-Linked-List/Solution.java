1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head == null || head.next == null) return null;
14        ListNode slow=head;
15        ListNode fast=head;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19        }
20        ListNode temp=head;
21        //go to the node before the middle node
22        while(temp.next!=slow){
23            temp=temp.next;
24        }
25        temp.next=slow.next;
26        slow.next=null;
27
28        return head;
29    }
30}