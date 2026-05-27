class Solution {
    public List<List<String>> partition(String s) {
        int start = 0;
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(s, start, result, temp);
        return result;
    }
    public void dfs(String s, int start, List<List<String>> result, List<String> temp) {
        if (start == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s , start , i)){
                temp.add(s.substring(start , i+1));
                dfs(s , i+1 , result , temp);
                temp.removeLast();
            }
        }
    }
    public boolean isPalindrome(String str , int s , int c){
        while (s <= c){
            if (str.charAt(s) != str.charAt(c)){
                return false;
            }
            s++;
            c--;
        }
        return true;
    }
}
