class Solution {
    public int[] solution(int money) {
        int n = 0;
        while (money>=5500){
            n++;
            money-=5500;
        }
        int[] answer = {n, money};
        return answer;
    }
}