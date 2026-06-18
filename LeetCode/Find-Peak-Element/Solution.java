1class Solution {
2    public int findPeakElement(int[] nums) {
3        int low=0;
4        int high=nums.length-1;
5        while(low<high){
6            int mid=(low+high)/2;
7            if(nums[mid]>nums[mid+1]) high=mid;
8            else low=mid+1;
9        }
10        return low;
11    }
12}