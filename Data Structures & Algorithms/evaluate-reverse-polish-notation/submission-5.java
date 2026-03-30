class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<>();
        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*")
            && !s.equals("/")) {
                int num = Integer.parseInt(s);
                res.push(num);
            } else {
                if (s.equals("+")) {
                    int num1 = res.pop();
                    int num2 = res.pop();
                    res.push(num1 + num2);
                } else if (s.equals("-")) {
                    int num1 = res.pop();
                    int num2 = res.pop();
                    res.push(num2 - num1);
                } else if (s.equals("*")) {
                    int num1 = res.pop();
                    int num2 = res.pop();
                    res.push(num1 * num2);
                } else if (s.equals("/")) {
                    int num1 = res.pop();
                    int num2 = res.pop();
                    res.push(num2 / num1);
                }
            }
        }

        return res.pop();
    }
}
