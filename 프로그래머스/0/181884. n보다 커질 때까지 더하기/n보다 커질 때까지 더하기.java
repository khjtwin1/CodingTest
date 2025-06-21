class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int arr = 0;
        do{
            answer += numbers[arr];
            arr++;
        }while(answer <= n);
        return answer;
    }
}