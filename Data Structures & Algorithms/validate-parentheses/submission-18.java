class Solution {
    public boolean isValid(String s) {
HashMap<Character, Character> map = new HashMap<>();
map.put(')', '(');
map.put(']', '[');
map.put('}', '{');   
        // String vowels1 = "{[(";
        String vowels2 = "}])";
    Deque<Character> qe = new ArrayDeque<>();   
        for (int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i);
    
        if (vowels2.indexOf(c) != -1){
            if (qe.isEmpty() || qe.pop() != map.get(c)){
                return false;
            }
        }else{
            qe.push(c);
        }
        }
    return qe.isEmpty();
    }
}