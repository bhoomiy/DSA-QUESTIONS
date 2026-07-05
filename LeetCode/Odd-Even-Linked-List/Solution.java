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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode odd=head;
15        ListNode even=head.next;
16        ListNode evenHead=even;
17        while(even!=null && even.next!=null){
18            odd.next=even.next;
19            odd=even.next;
20
21            even.next=odd.next;
22            even=odd.next;
23        }
24        odd.next=evenHead;
25
26        return head;
27    }
28}