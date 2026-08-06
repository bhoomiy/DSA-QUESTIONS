1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n=arr.length;
4        Stack<Integer> st=new Stack<>();
5        int ple[]=new int[n];
6        int nle[]=new int[n];
7        int mod=1000000007;
8
9        //Previous Less Element
10        for(int i=0;i<arr.length;i++){
11            while(!st.isEmpty() && arr[st.peek()]>arr[i])
12                st.pop();
13            if (st.isEmpty()) ple[i]=-1;
14            else ple[i]=st.peek();
15            st.push(i);
16        }
17        st.clear();
18
19        //Next Less Element
20        for(int i=n-1;i>=0;i--){
21            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
22                st.pop();
23            if(st.isEmpty()) nle[i]=n;
24            else nle[i]=st.peek();
25            st.push(i);
26        }
27        long ans=0;
28        for (int i=0;i<n;i++) {
29            long left = i - ple[i];
30            long right = nle[i] - i;
31
32            ans = (ans + (left * right % mod) * arr[i]) % mod;
33        }
34        return (int) ans;
35    }
36}