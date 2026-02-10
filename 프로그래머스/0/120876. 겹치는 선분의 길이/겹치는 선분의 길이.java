class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[201];
        for (int i = 0; i < 2; i++) {
            int start = lines[i][0], end = lines[i][1];
            for (int j = i + 1; j < 3; j++) {
                int compareStart = lines[j][0], compareEnd = lines[j][1];
                while (compareStart < compareEnd) {
                    if (compareStart >= start && compareStart < end)
                        cnt[compareStart +100]++;
                    compareStart++;
                }
            }
        }
        for (int i : cnt) {
            if (i >= 1) answer++;
        }
        return answer;
    }
}