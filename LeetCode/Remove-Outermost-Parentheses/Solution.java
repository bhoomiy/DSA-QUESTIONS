1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder ans=new StringBuilder();
4        int count=0;
5        for(char ch:s.toCharArray()){
6            if (ch=='('){
7                if(count>0) ans.append(ch);
8                count++;
9            }
10            else{
11                count--;
12                if(count>0) ans.append(ch);
13            }
14        }
15        return ans.toString();
16    }
17}