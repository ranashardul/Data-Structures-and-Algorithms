class MyStack {

    private Queue<Integer> obj;

    public MyStack() {
        obj = new LinkedList<>();    
    }
    
    public void push(int x) {
        obj.add(x);
        for(int i=0; i<obj.size()-1; i++){
            obj.add(obj.remove());
        }
    }
    
    public int pop() {
        return obj.remove();
    }
    
    public int top() {
        return obj.peek();
    }
    
    public boolean empty() {
        return obj.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */