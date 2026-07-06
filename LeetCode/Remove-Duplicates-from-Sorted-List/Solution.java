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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode temp=head;
15        while(temp!=null && temp.next!=null){
16            if(temp.val==temp.next.val){
17                temp.next=temp.next.next;
18            }else temp=temp.next;
19        }
20        return head;
21    }
22}