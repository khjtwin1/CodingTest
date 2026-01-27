class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > max) {
                max = citations[i];
            }
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            int h = i;
            int more = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= h) {
                    more++;
                }
            }
            if (more >= h && citations.length - more <= h && h > answer) {
                answer = h;
            }
        }
        return answer;
    }
}