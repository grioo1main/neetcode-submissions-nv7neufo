class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); 
            String temp = new String(chars); 
            if (map.containsKey(temp)){
                map.get(temp).add(s);
            } else{
                map.put(temp, new ArrayList<>(List.of(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
