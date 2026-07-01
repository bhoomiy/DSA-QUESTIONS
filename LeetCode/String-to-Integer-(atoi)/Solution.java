1class Solution {
2    public int myAtoi(String s) {
3       int i=0,n=s.length();
4        while(i<n && s.charAt(i)==' '){
5            i++;
6        }
7        if(i==n) return 0;
8        int sign=1;
9        if(s.charAt(i)=='-') {
10            sign=-1;
11            i++;
12        }else if(s.charAt(i)=='+') i++;
13        int ans=0;
14        while(i<n && Character.isDigit(s.charAt(i))){
15            int digit=s.charAt(i)-'0';
16            // Check overflow
17            if (ans > (Integer.MAX_VALUE - digit) / 10) {
18                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
19            }
20
21            ans=ans*10+digit;
22            i++;
23        }
24        return sign*ans; 
25    }
26}