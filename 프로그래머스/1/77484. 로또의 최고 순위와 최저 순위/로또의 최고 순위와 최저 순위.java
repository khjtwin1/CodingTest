class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, match = 0;
        boolean[] find = new boolean[6];
        for (int l : lottos) {
            if(l == 0) {
                zero++;
            } else {
                for(int w : win_nums){
                    if(l == w){
                        match++;
                        break;
                    }
                }
            }            
        }
        int max = match + zero;
        int min = match;
        int[] answer = new int[2];
        answer[0] = max >= 2 ? 7 - max : 6;
        answer[1] = min >= 2 ? 7 - min : 6;
        return answer;
    }
}