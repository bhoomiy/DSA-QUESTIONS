1class Solution {
2    public int romanToInt(String s) {
3        Map<Character,Integer> roman=new HashMap<>();
4        roman.put('I',1);
5        roman.put('V',5);
6        roman.put('X',10);
7        roman.put('L',50);
8        roman.put('C',100);
9        roman.put('D',500);
10        roman.put('M',1000);
11
12        int res=0;
13        for(int i=0;i<s.length()-1;i++){
14            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
15                res-=roman.get(s.charAt(i));
16            }else{
17                res+=roman.get(s.charAt(i));
18            }
19        }
20        return res + roman.get(s.charAt(s.length() - 1));
21    }
22}