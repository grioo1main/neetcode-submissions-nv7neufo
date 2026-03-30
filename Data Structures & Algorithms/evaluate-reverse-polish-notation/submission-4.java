class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = 0;
        
        for (String s : tokens) {
            switch (s) {
                case "+":
                    top--;                             
                    stack[top - 1] += stack[top];       
                    break;
                case "-":
                    top--;
                    stack[top - 1] -= stack[top];
                    break;
                case "*":
                    top--;
                    stack[top - 1] *= stack[top];
                    break;
                case "/":
                    top--;
                    stack[top - 1] /= stack[top];
                    break;
                default:
                    stack[top] = Integer.parseInt(s);   
                    top++;                            
            }
        }
        return stack[0];
    }
}