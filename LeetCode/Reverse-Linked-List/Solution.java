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
12    public ListNode reverseList(ListNode head) {
13        if (head==null || head.next==null){
14            return head;
15        }
16    /*
17        ListNode prevNode=null;
18        ListNode currNode=head;
19        while(currNode!=null){
20            ListNode nextNode=currNode.next;
21            currNode.next=prevNode;
22
23            //update
24            prevNode=currNode;
25            currNode=nextNode;
26        }
27        return prevNode;
28    */
29
30    ListNode newHead=reverseList(head.next);
31    head.next.next=head;
32    head.next=null;
33    return newHead;
34    }
35}