class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int sequence = 0;
        int fightT = attacks[attacks.length - 1][0];
        for (int i = 0; i <= fightT; i++) {
            boolean attack = false;
            for (int j = 0; j < attacks.length; j++) {
                if (attacks[j][0] == i) {
                    answer -= attacks[j][1];
                    if (answer <= 0) {
                        return -1;
                    }
                    sequence = 0;
                    attack = true;
                    break;
                }
            }
            if (!attack) {
                answer += bandage[1];
                sequence++;
            }
            if (sequence == bandage[0]) {
                answer += bandage[2];
                sequence = 0;
            }
            if (answer > health) {
                answer = health;
            }
        }
        return answer;
    }
}