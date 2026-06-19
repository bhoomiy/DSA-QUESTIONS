1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int max=nums[0];
4       for(int i=0;i<nums.length;i++){
5        if(nums[i]>max) max=nums[i];
6       }
7       int low=1,high=max;
8       while(low<=high){
9        int mid=(low+high)/2;
10        if (sumof(nums,mid)<=threshold) high=mid-1;
11        else low=mid+1;
12       }
13       return low;
14    }
15
16    public int sumof(int arr[],int mid){
17        int sum=0;
18        for(int i=0;i<arr.length;i++){
19            sum+=Math.ceil((double)arr[i]/mid);
20        }
21        return sum;
22    }
23}