class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int temp = n;
        while(n!=1){
            if(n%2==0)
                n/=2;
            else
                n=3*n+1;
            cnt++;
        }
        int[] answer = new int[cnt + 1];
        answer[0] = temp;
        
        for(int i = 1; i<answer.length; i++){
            if(temp%2==0)
                temp/=2;
            else
                temp=3*temp+1;
            answer[i] = temp;
        }
        return answer;
    }
}