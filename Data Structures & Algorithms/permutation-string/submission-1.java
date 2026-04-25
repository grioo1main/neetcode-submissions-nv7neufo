class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        long targetHash = 0, currentHash = 0;

        for (int i = 0; i < n1; i++) {
            targetHash += (long) s1.charAt(i) * s1.charAt(i);
            currentHash += (long) s2.charAt(i) * s2.charAt(i);
        }

        for (int i = 0; i <= n2 - n1; i++) {
            if (currentHash == targetHash && check(s1, s2, i)) {
                return true;
            }

            if (i < n2 - n1) {
                long out = s2.charAt(i);
                long in = s2.charAt(i + n1);
                currentHash = currentHash - (out * out) + (in * in);
            }
        }
        return false;
    }

    private boolean check(String s1, String s2, int start) {
        int[] counts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(start + i) - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;
        return true;
    }
}
