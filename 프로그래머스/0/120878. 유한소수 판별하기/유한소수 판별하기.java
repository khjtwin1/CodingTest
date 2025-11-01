class Solution {
    public int solution(int a, int b) {
        if(a%b==0)
            return 1;
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                a/= i;
                b/=i;
            }
        }
        while(b%2==0 || b%5==0){
            if(b%2==0)
                b/=2;
            else if(b%5==0)
                b/=5;
        }
        if(b==1)
            return 1;
        else
            return 2;
    }
}