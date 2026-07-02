1class Solution {
2    public int beautySum(String s) {
3        int ans=0;
4        for(int i=0;i<s.length();i++){
5            int freq[]=new int[26];
6            for(int j=i;j<s.length();j++){
7                freq[s.charAt(j)-'a']++;
8                int max=0;
9                int min=Integer.MAX_VALUE;
10                for (int k=0;k<26;k++){
11                    if(freq[k]>0){
12                        max=Math.max(max,freq[k]);
13                        min=Math.min(min,freq[k]);
14                    }
15                }
16                ans+=max-min;
17            }
18        }
19        return ans;
20    }
21}