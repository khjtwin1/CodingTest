class Solution {
    public long solution(int price, int money, int count) {
        long pay = 0;
        for(int i = 1; i<=count; i++){
            pay += price*i;
        }
        long answer = money - pay;
        if(answer<0){
            return answer*-1;
        }
        return 0;
    }
}