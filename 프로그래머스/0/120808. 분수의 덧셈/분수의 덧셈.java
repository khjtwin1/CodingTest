class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int s = (numer1 * denom2) + (numer2 * denom1);//9
        int m = denom1 * denom2;// 18
        int b = Math.max(s, m);//9
        int n = 0;
        for (int i = 1; i <= b; i++) {
            if (s % i == 0 && m % i == 0) {
                n = i;
            }
        }
        int answer[] = {s/n, m/n};
        return answer;
    }
}