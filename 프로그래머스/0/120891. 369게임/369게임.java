class Solution {
    public int solution(int order) {
        int answer = 0;
        int i = 1000000;
        do{
            if(order/i==3||order/i==6||order/i==9) {
                answer++;
            }
            order=order%i;
            i/=10;
        }while (i>0);
        return answer;
    }
}