class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs){
            sb.append(str.length()).append(" ").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int x = 0, r = 0;

        while (r < str.length()) {
            while (str.charAt(r) != ' ') {
                r++;
            }
            int len = Integer.parseInt(str.substring(x, r));
            x = r+1;
            r = x + len;
            list.add(str.substring(x, r));
            x = r;
        }
        return list;
    }
}