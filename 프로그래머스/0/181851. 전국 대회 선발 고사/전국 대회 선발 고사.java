class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int n = 1;
        int[] mul = {10000, 100, 1};
        int k = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (n == rank[j] && attendance[j]) {
                    answer += mul[k++] * j;
                }
            }
            if (k == 3) {
                    return answer;
            }
            n++;
        }
        return answer;
    }
}