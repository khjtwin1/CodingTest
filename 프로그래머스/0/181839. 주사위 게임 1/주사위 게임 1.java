class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2!=0 && b%2!=0)
            return a*a+b*b;
        else if(a%2!=0 || b%2!=0)
            return 2*(a+b);
        else{
            if(a-b<0)
                return -(a-b);
            else
                return a-b;
        }
    }
}