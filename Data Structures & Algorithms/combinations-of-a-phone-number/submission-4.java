class Solution {
    private static final String[] MAPPING = {
        "", "", "abc",  "def",  "ghi",  "jkl",  "mno", "pqrs", "tuv",  "wxyz" 
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        dfs(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void dfs(String digits, int index, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        String letters = MAPPING[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            dfs(digits, index + 1, path, result);
            path.setLength(path.length() - 1);
        }
    }
}