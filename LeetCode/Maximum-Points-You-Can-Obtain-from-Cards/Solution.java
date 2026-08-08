1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int n=cardPoints.length;
4        int totalSum=0;
5        for(int card:cardPoints) totalSum+=card;
6        int windowsize=n-k;
7        if(windowsize==0)  return totalSum;
8        int windowsum=0;
9        for(int i=0;i<windowsize;i++) windowsum+=cardPoints[i];
10        int min=windowsum;
11        for(int right=windowsize;right<n;right++){
12            windowsum+=cardPoints[right];
13            windowsum-=cardPoints[right-windowsize];
14            min=Math.min(min,windowsum);
15        }
16        return totalSum-min;
17    }
18}