class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        s = s.toLowerCase();
        while (l < r) {
            while (l < r && isNonAlphaNumeric(s.charAt(l))) {
                l++;
            }
            while (r > l && isNonAlphaNumeric(s.charAt(r))) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isNonAlphaNumeric(char c) {
        return (c < 'a' || c > 'z') && (c < '0' || c > '9');
    }
}
