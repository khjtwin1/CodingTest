class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(n%(i+1)==0)
                cnt++;
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 0; i<n; i++){
            if(n%(i+1)==0){
                answer[cnt] = i+1;
                cnt++;
            }
        }
        return answer;
    }
}