1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        int freq[]=new int[26];
5        for(int i=0;i<s.length();i++){
6            freq[s.charAt(i)-'a']++;
7        }
8        for(int i=0;i<t.length();i++){
9            freq[t.charAt(i)-'a']--;
10        }
11        for (int i=0;i<26;i++){
12            if(freq[i]!=0) return false;
13        }
14        return true;
15    }
16}