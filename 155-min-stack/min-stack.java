class MinStack {

    Stack<Integer>st;
    Stack<Integer>minstack;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        st=new Stack<>();   //asked to initialize the stack object inside the minstack class that's why we are initialized inside here
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        if(val<=min){
            st.push(min);
            min=val;
        }
        st.push(val);
        // st.push(val);
        // if(minstack.isEmpty()){
        //     minstack.push(val);
        // }else{
        //     minstack.push(Math.min(st.peek(),minstack.peek()));
        // }
    }
    
    public void pop() {
        // st.pop();
        // minstack.pop();
        if(st.pop()==min){
            min=st.pop();
        }

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
        // return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */