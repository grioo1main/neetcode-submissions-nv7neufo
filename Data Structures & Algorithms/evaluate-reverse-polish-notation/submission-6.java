class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        int top;
        int second;
        Stack<Integer> stack = new Stack<>();  
        for (int i = 0; i < tokens.length; i++) {
            String word = tokens[i];
            if ("+-*/".indexOf(word) == -1) {  
                stack.add(Integer.parseInt(word));  
            } else {
                top = stack.pop();
                second = stack.pop(); 
                switch (word) {
                    case "+": result = second + top; break;  
                    case "-": result = second - top; break;
                    case "*": result = second * top; break;
                    case "/": result = second / top; break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }  
}