1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st=new Stack<>();
4        HashMap<Integer,Integer> map=new HashMap<>();
5        int n=nums2.length;
6        for(int i=n-1;i>=0;i--){
7            //pop all the smaller or equal elements
8            while(!st.isEmpty() && st.peek()<=nums2[i])
9                st.pop();
10
11            // If stack is empty, no greater element
12            if(st.isEmpty()) map.put(nums2[i],-1);
13
14            // Else top of stack is the answer
15            else map.put(nums2[i],st.peek());
16
17            st.push(nums2[i]); //push the curr ele
18        }
19        int nge[]=new int[nums1.length];
20        for (int i = 0; i < nums1.length; i++) {
21            nge[i] = map.get(nums1[i]);
22        }
23
24        return nge;
25    }
26}