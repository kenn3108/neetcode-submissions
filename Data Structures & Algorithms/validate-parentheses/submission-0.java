class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '}' || c == ']' || c == ')') {
                if(myStack.isEmpty()) {
                    return false;
                }else {
                    char charInStack = myStack.pop();
                    if (charInStack == '{' && c == '}') {
                        continue;
                    }else if (charInStack == '[' && c == ']') {
                        continue;
                    }else if (charInStack == '(' && c == ')') {
                        continue;
                    }else {
                        return false;
                    }
                }
            }else {
                myStack.push(c);
            }
        }

        return myStack.isEmpty();
    }
}
