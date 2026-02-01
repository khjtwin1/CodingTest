class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = -1;
        int bM, bm, wM, wm;
        do {
            bM = Math.max(bill[0], bill[1]);
            bm = Math.min(bill[0], bill[1]);
            wM = Math.max(wallet[0], wallet[1]);
            wm = Math.min(wallet[0], wallet[1]);
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        } while (bm > wm || bM > wM);
        return answer;
    }
}