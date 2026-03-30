class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c , 0) + 1);
        }
        for (int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c , 0) + 1);
        }

        return mapS.equals(mapT);




    }
}