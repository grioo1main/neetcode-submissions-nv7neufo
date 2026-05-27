class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        List<List<Character>> keypad = new ArrayList<>(11);

        keypad.add(null);
        keypad.add(null);

        char currentLetter = 'a';

        for (int key = 2; key <= 9; key++) {
            int size = (key == 7 || key == 9) ? 4 : 3;

            List<Character> letters = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                letters.add(currentLetter++);
            }

            keypad.add(letters);
        }
        System.out.println(keypad);

        dfs(digits , 0 , new StringBuilder() , keypad , result);
        return result;
    }


    public void dfs(String digits , int curr , StringBuilder  sb , List<List<Character>> key, List<String> result){

        if (curr == digits.length()){
            result.add(sb.toString());
            return;
        }
        int len = sb.length();
        List<Character> list = key.get(Character.getNumericValue(digits.charAt(curr)));
        for (int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i));
            dfs(digits , curr+1 , sb , key , result);
            sb.setLength(len);
        }
    }
}
