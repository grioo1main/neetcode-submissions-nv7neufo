class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> list = new ArrayList<>(9); 
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<>()); 
        }

        for (int i = 0 ; i < 9 ; i++){
            Set<Character> jSet = new HashSet<>();
            Set<Character> iSet = new HashSet<>();
            for (int j = 0 ; j < 9 ; j++){
                if (jSet.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                if (list.get((i / 3) * 3 + (j / 3)).contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                
                list.get((i / 3) * 3 + (j / 3)).add(board[i][j]);
                jSet.add(board[i][j]);
            }
            for (int j = 0 ; j < 9 ; j++){
                if (iSet.contains(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
                iSet.add(board[j][i]);
            }
        }
        return true;
    }
}
