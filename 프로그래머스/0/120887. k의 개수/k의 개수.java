class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ck = (char) (k + '0');
        for (int a = i; a <= j; a++) {
            String change = Integer.toString(a);
            for (int b = 0; b < change.length(); b++) {
                if (change.charAt(b) == ck)
                    answer++;
            }
        }
        return answer;
    }
}