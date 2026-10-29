class MinStack {
    private Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int minValue = Integer.MAX_VALUE;
        for (Integer item : stack) {
            if (item < minValue) {
                minValue = item;
            }
        }
        return minValue;
    }
}
