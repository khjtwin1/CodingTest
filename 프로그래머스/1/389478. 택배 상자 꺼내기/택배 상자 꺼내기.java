class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (num - 1) / w;
        int col = row % 2 == 0 ? (num - 1) % w : w - 1 - (num - 1) % w;
        int height = (n + w - 1) / w;
        for (int i = row; i < height; i++) {
            int value = i % 2 == 0 ? i * w + col + 1 : i * w + (w - col);
            if (value <= n) answer++;
        }
        return answer;
    }
}