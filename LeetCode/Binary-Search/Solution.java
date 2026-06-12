1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0 , high = nums.length -1;
4        for(int i=0;i<nums.length ; i++){
5            int mid = (high + low)/ 2;
6            if(nums[mid] == target) return mid;
7            else if(nums[mid]> target) high = mid - 1;
8            else low = mid + 1;
9        }
10        return -1;
11    }
12}