class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = (num + 1) / 2;
        for (int i = 0; i < num; i++) {
            answer[i] = total / num - n + 1;
            n--;
        }
        return answer;
    }
}