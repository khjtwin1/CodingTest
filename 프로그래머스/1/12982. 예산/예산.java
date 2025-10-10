class Solution {
    public int solution(int[] d, int budget) {
        for(int i = 0; i<d.length-1; i++){
            for(int j = i+1; j<d.length; j++){
                if(d[i]>d[j]){
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }
        int answer = 0;
        for(int i = 0; i<d.length; i++){
            if(budget>=d[i]){
                budget-=d[i];
                answer++;
            } else return answer;
        }
        return answer;
    }
}