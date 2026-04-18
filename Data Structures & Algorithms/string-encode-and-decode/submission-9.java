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
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i+=0){
            sb.setLength(0);
            while (i < str.length() && str.charAt(i) != ' '){
                sb.append(str.charAt(i));
                i++;
            }
            i++;
            int len = Integer.parseInt(sb.toString());
            sb.setLength(0);
            for (int j = 0 ; j < len; j++){
                sb.append(str.charAt(i));
                i++;
            }
            list.add(sb.toString());
        }
        return list;
    }
}