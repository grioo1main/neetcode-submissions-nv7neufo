class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.merge(t.charAt(i), -1, Integer::sum);
        }
        int req = map.size();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            set.add(t.charAt(i));
        }
        int bestL = -1;
        int bestR = -1;
        int best = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            map.merge(s.charAt(r), 1, Integer::sum);
            if (map.get(s.charAt(r)) == 0 && set.contains(s.charAt(r))) {
                req--;
            }
            while (req == 0) {
                if (r - l + 1 < best) { // длина окна [l, r] = r - l + 1
                    best = r - l + 1;
                    bestL = l;
                    bestR = r + 1;
                }
                if (set.contains(s.charAt(l))) {
                    map.merge(s.charAt(l), -1, Integer::sum);

                    if (map.get(s.charAt(l)) == -1)
                        req++;
                } else {
                    map.computeIfPresent(s.charAt(l), (key, value) -> value > 1 ? value - 1 : null);
                }
                l++;
            }
        }
        return bestL == -1 ? "" : s.substring(bestL, bestR);
    }
    // public static chek(HashMap<Character, Integer> map , HashSet<Character> set){

    // }
}
