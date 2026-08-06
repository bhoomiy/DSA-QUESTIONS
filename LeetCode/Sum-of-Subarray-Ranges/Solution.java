1class Solution {
2    public long subArrayRanges(int[] nums) {
3        long minSum = calculateMinimumContribution(nums);
4     long maxSum = calculateMaximumContribution(nums);
5     return maxSum - minSum;
6    }
7    public static long calculateMinimumContribution(int arr[]){
8        int n=arr.length;
9        Stack<Integer> st=new Stack<>();
10        int ple[]=new int[n];
11        int nle[]=new int[n];
12
13        //Previous Less Element
14        for(int i=0;i<arr.length;i++){
15            while(!st.isEmpty() && arr[st.peek()]>arr[i])
16                st.pop();
17            if (st.isEmpty()) ple[i]=-1;
18            else ple[i]=st.peek();
19            st.push(i);
20        }
21        st.clear();
22
23        //Next Less Element
24        for(int i=n-1;i>=0;i--){
25            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
26                st.pop();
27            if(st.isEmpty()) nle[i]=n;
28            else nle[i]=st.peek();
29            st.push(i);
30        }
31        long ans=0;
32        for (int i=0;i<n;i++) {
33            long left = i - ple[i];
34            long right = nle[i] - i;
35
36            ans += left * right * (long) arr[i];
37        }
38        return ans;
39    }
40
41    public static long calculateMaximumContribution(int arr[]){
42        int n=arr.length;
43        Stack<Integer> st=new Stack<>();
44        int pge[]=new int[n];
45        int nge[]=new int[n];
46
47        //Previous Greater Element
48        for(int i=0;i<arr.length;i++){
49            while(!st.isEmpty() && arr[st.peek()]<arr[i])
50                st.pop();
51            if (st.isEmpty()) pge[i]=-1;
52            else pge[i]=st.peek();
53            st.push(i);
54        }
55        st.clear();
56
57        //Next Greater Element
58        for(int i=n-1;i>=0;i--){
59            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
60                st.pop();
61            if(st.isEmpty()) nge[i]=n;
62            else nge[i]=st.peek();
63            st.push(i);
64        }
65        long ans=0;
66        for (int i=0;i<n;i++) {
67            long left = i - pge[i];
68            long right = nge[i] - i;
69
70            ans += left * right * (long) arr[i];
71        }
72        return  ans;
73    }
74}