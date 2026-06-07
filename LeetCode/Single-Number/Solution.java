1class Solution {
2    public int singleNumber(int[] nums) {
3        int xorr=0;
4        for (int num:nums){
5            xorr^=num;
6        }
7
8        return xorr;
9    }
10}