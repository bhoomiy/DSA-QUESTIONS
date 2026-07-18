1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(ch=='(' || ch=='{' || ch=='[')  st.push(ch);
6            else{
7                if(st.isEmpty()) return false;
8                char top=st.pop();
9
10                if(((ch==')') && (top=='(')) || ((ch=='}') && (top=='{')) || 
11                ((ch==']') && (top=='[')))
12                    continue;
13                else 
14                    return false;
15            }
16        }
17        return st.isEmpty();
18    }
19}