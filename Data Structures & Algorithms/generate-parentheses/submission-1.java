class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(0 , 0 , n , result , sb);
        return result;
    }
    public void dfs(int open, int close, int target, List<String> result, StringBuilder sb) {
        int len = sb.length();
        if ((target * 2) - len == 0) {
            result.add(sb.toString());
            return;
        }
        // for (int i = len; i < target * 2; i++) {
            if (open < target) {
                sb.append("(");
                dfs(open+1, close, target, result, sb);
                sb.setLength(len); 
            }
            if (open > close) {
                sb.append(")");
                dfs(open, close+1, target, result, sb);
                sb.setLength(len); 
            }
        // }
    }
}
