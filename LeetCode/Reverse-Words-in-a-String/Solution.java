1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder ans=new StringBuilder();
4        String[] words=s.trim().split("\\s+");
5        for(int i=words.length-1;i>=0;i--){
6            ans.append(words[i]);
7            if(i!=0) ans.append(" ");
8        }
9        return ans.toString();
10    }
11}