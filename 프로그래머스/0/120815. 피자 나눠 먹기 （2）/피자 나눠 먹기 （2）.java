class Solution {
    public int solution(int n) {
        int answer = 0;
        do{
            answer++;
        }while(answer*6%n!=0);
        return answer;
    }
}