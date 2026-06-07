1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxi=0;
4        int cnt=0;
5        for (int i=0;i<nums.length;i++){
6            if (nums[i]==1){
7                cnt++;
8                maxi=Math.max(maxi,cnt);
9            }
10            else{
11                cnt=0;
12            }
13        }
14        return maxi;
15    }
16}