class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray(); 
            java.util.Arrays.sort(chars);  
            String skey = new String(chars);
            map.computeIfAbsent(skey, k -> new ArrayList<>()).add(s);
        }

        list = map.values().stream().toList();

        return list;

    }
}
