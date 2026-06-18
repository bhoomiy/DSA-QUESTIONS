1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int max=nums[0];
4      for(int i=0;i<nums.length;i++){
5        if(nums[i]>max){
6            max=nums[i];
7        }
8        }
9        int [] freq=new int[max+1];
10        for(int i=0;i<nums.length;i++){
11            freq[nums[i]]++;
12        }
13        for(int i=0;i<freq.length;i++){
14            if(freq[i]==1){
15                return i;
16            }
17        }
18              return -1;
19    }
20}