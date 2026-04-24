class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }
        int max = 0;
        int temp = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0, j = 0; j < s.length();) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            } else {
                max = Math.max(max, (j - i));
                set.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max, (j - i));

        }
        
        return max;
    }
}
