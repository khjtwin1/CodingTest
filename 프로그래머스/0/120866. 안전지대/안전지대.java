class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] bomb = new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < bomb.length && l >= 0 && l < bomb.length) {
                                bomb[k][l] = true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < bomb.length; i++) {
            for (int j = 0; j < bomb.length; j++) {
                if (!bomb[i][j]) answer++;
            }
        }
        return answer;
    }
}