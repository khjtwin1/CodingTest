class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            int s = chicken/10;
            answer += s;
            chicken = s + chicken%10;
        }
        return answer;
    }
}