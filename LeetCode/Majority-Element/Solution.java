1class Solution {
2    public int majorityElement(int[] nums) {
3        int candidate=0,count=0;
4        for(int num: nums){
5            if(count==0){
6                candidate=num;
7            }
8            if(num==candidate){
9                count++;
10            }
11            else{
12                count--;
13            }
14        }
15        return candidate;
16    }
17}