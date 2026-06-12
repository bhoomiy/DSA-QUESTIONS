1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low=0,high=nums.length-1;
4      int ans=nums.length;
5      while(low<=high){
6        int mid=(low+high)/2;
7        if(nums[mid]>=target){
8            ans=mid;
9            high=mid-1;
10        }
11        else{
12            low=mid+1;
13        }
14      }
15      return ans;
16    }
17}