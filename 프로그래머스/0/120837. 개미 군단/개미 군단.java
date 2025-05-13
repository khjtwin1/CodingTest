class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant1 = 0;
        int ant2 = 0;
        int ant3 = 0;
        if (hp>=5) {
            ant1 = hp/5;
            hp = hp%5;
        }
        if (hp>=3) {
            ant2 = hp/3;
            hp = hp%3;
        }
        if (hp>=1)
            ant3 = hp;
        answer = ant1 + ant2 + ant3;
        return answer;
    }
}