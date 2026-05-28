class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n == 2 || n == 3) {
            return result;
        }
        List<String> temp = new ArrayList<>();
        int[][] c = new int[n][2];

        dfs(c, result, temp, new boolean[n][n], 0);
        return result;
    }

    public void dfs(int[][] c, List<List<String>> result, List<String> temp, boolean[][] bool, int curr) {
        int size = c.length;

        if (curr == size) {
            char[] ch = new char[size * size];
            Arrays.fill(ch, '.');

            for (int i = 0; i < size; i++) {
                int x = c[i][0];
                int y = c[i][1];
                ch[y * size + x] = 'Q';
            }

            for (int i = 0; i < size; i++) {
                temp.add(new String(ch, i * size, size));
            }

            result.add(new ArrayList<>(temp));
            temp.clear();
            return;
        }

        for (int i = 0; i < size; i++) {
            if (bool[curr][i]) {
                continue;
            }

            c[curr][0] = i;
            c[curr][1] = curr;

            boolean[][] boolCopy = new boolean[size][size];
            for (int j = 0; j < size; j++) {
                boolCopy[j] = bool[j].clone();
            }

            takeQueen(boolCopy, curr, i);
            dfs(c, result, temp, boolCopy, curr + 1);
        }
    }

    public void takeQueen(boolean[][] bool, int y, int x) {
        int size = bool.length;

        for (int i = 0; i < size; i++) {
            bool[y][i] = true;
            bool[i][x] = true;
        }

        for (int i = 1; i < size; i++) {
            if (y + i < size && x + i < size) {
                bool[y + i][x + i] = true;
            }
            if (y + i < size && x - i >= 0) {
                bool[y + i][x - i] = true;
            }
            if (y - i >= 0 && x + i < size) {
                bool[y - i][x + i] = true;
            }
            if (y - i >= 0 && x - i >= 0) {
                bool[y - i][x - i] = true;
            }
        }
    }
}
