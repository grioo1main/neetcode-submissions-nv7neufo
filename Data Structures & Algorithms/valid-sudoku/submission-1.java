class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] boxes = new HashSet[3];
        for (int b = 0; b < 3; b++) {
            boxes[b] = new HashSet<>();
        }
        
        HashSet<Integer> setI = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                for (int b = 0; b < 3; b++) {
                    boxes[b].clear();
                }
            }
            
            HashSet<Integer> setJ = new HashSet<>();
            
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    int num = board[i][j] - '0';
                    
                    if (setJ.contains(num)) {
                        return false;
                    }
                    setJ.add(num);
                    
                    int boxIndex = j / 3;
                    if (boxes[boxIndex].contains(num)) {
                        return false;
                    }
                    boxes[boxIndex].add(num);
                }
            }
            
            for (int k = 0; k < 9; k++) {
                if (Character.isDigit(board[k][i])) {
                    int num = board[k][i] - '0';
                    if (setI.contains(num)) {
                        return false;
                    }
                    setI.add(num);
                }
            }
            
            setI.clear();
        }
        
        return true;
    }
}
