class Solution {
    public int solution(int n) {
        while(true){
            int mul = 1;
            for(int i = 1; i<=n; i++){
                mul *= i;
                if(mul==n)
                    return i;
                else if(mul>n)
                    return i-1;
            }
        }
    }
}