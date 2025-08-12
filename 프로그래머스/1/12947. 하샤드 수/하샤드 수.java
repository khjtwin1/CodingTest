class Solution {
    public boolean solution(int x) {
        int d = 1; 
        while(d<=x){
            d*=10;
        }
        d/=10;
        int num = x;
        int sum = 0;
        while(d>0){
            sum+=num/d;
            num%=d;
            d/=10;
        }
        boolean answer = x%sum == 0 ? true : false;
        return answer;
    }
}