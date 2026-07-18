1class MyStack {
2    private Queue<Integer> qstack;
3    public MyStack() {
4        qstack=new LinkedList<>();
5    }
6    
7    public void push(int x) {
8        qstack.offer(x);
9        int size=qstack.size();
10        while(size>1){
11            qstack.offer(qstack.poll());
12            size--;
13        }
14    }
15    
16    public int pop() {
17        return qstack.poll();
18    }
19    
20    public int top() {
21        return qstack.peek();
22    }
23    
24    public boolean empty() {
25        return qstack.isEmpty();
26    }
27}
28
29/**
30 * Your MyStack object will be instantiated and called as such:
31 * MyStack obj = new MyStack();
32 * obj.push(x);
33 * int param_2 = obj.pop();
34 * int param_3 = obj.top();
35 * boolean param_4 = obj.empty();
36 */