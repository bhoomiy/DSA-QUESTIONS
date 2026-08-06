1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st=new Stack<>();
4    for(int asteroid:asteroids){
5        boolean alive=true;
6        while(alive && asteroid<0 && !st.isEmpty() && st.peek()>0){
7            if(st.peek()< -asteroid) st.pop(); //top explodes
8            else if(st.peek()==-asteroid) {    //both explodes
9                alive=false;
10                st.pop();
11            }
12            else alive=false;                   //currrent explodes
13        }
14        if(alive) st.push(asteroid);
15    }
16
17    int ans[]=new int[st.size()];
18    for(int i=st.size()-1;i>=0;i--){
19        ans[i]=st.pop();
20    }
21    return ans;
22    }
23}