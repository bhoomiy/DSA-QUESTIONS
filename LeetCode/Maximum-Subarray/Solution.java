1class Solution {
2    public int maxSubArray(int[] nums) {
3        long maxi=Long.MIN_VALUE;
4        long sum=0;
5        for (int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            if(sum>maxi){
8                maxi=sum;
9            }
10            if(sum<0){
11                sum=0;
12            }
13        }
14        return (int)maxi;
15    }
16}