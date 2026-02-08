class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] win = new boolean[n][n];
        for (int[] rank : results) {
            win[rank[0] - 1][rank[1] - 1] = true;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (win[i][k] && win[k][j]) win[i][j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (win[i][j] || win[j][i]) cnt++;
            }
            if (cnt == n - 1) answer++;
        }
        return answer;
    }
}