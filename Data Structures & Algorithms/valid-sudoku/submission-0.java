class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];

                if (currentVal != '.') {
                    
                    String rowKey = currentVal + " found in row " + i;
                    String colKey = currentVal + " found in col " + j;
                    String boxKey = currentVal + " found in box " + (i / 3) + "-" + (j / 3);

                    
                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
