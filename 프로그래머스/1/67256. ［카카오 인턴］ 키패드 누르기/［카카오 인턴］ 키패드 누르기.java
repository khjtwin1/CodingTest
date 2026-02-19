class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lr = 3, lc = 0, rr = 3, rc = 2;
        for (int i : numbers) {
            if(i == 0) i = 11;
            int tr = (i - 1) / 3;
            int tc = (i - 1) % 3;
            switch(i) {
                case 1, 4, 7 -> {
                    answer += "L";
                    lr = tr;
                    lc = tc;
                }
                case 3, 6, 9 -> {
                    answer += "R";
                    rr = tr;
                    rc = tc;
                }
                default -> {
                    int dl = Math.abs(lr - tr) + Math.abs(lc - tc);
                    int dr = Math.abs(rr - tr) + Math.abs(rc - tc);
                    if (dl == dr) {
                        if (hand.equals("left")) {
                            answer += "L";
                            lr = tr;
                            lc = tc;
                        } else {
                            answer += "R";
                            rr = tr;
                            rc = tc;
                        }
                    } else if (dl < dr) {
                        answer += "L";
                            lr = tr;
                            lc = tc;
                    } else {
                            answer += "R";
                            rr = tr;
                            rc = tc;
                        }
                }
            }
        }
        return answer;
    }
}