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
12    public ListNode sortList(ListNode head) {
13        if (head==null || head.next==null) return head;
14        ListNode slow=head;
15        ListNode fast=head.next;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19        }
20        //split 
21        ListNode secondHead=slow.next;
22        slow.next=null;
23
24        //sort both the ll
25        ListNode left=sortList(head);
26        ListNode right=sortList(secondHead);
27
28        //merge both the sorted ll
29        return merge(left,right);
30    }
31
32    public ListNode merge(ListNode l1,ListNode l2){
33        ListNode dummy=new ListNode(0);
34        ListNode tail=dummy; //always poiints to the end of the sorted ll
35
36        while(l1!=null && l2!=null){
37            if(l1.val<=l2.val){
38                tail.next=l1;
39                l1=l1.next;
40            }else{
41                tail.next=l2;
42                l2=l2.next;
43            }
44            tail=tail.next;
45        }
46        if(l1!=null) tail.next=l1;
47        else tail.next=l2;
48
49        return dummy.next;
50    }
51}