1class Solution {
2    public int search(int[] nums, int target) {
3        int low=0,high=nums.length-1;
4        while(low<=high){
5            int mid=(low+high)/2;
6            if(nums[mid]==target) return mid;
7            if(nums[low]<=nums[mid]){
8                if((nums[low]<=target) && (nums[mid]>target)) high=mid-1;
9                else low=mid+1;
10            }else{
11                if((nums[mid]<target)&&(nums[high]>=target)) low=mid+1;
12                else high=mid-1;
13            }
14        }
15        return -1;
16    }
17}