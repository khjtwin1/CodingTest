class Solution {
    public int solution(int number, int limit, int power) {
        int[] soldier = new int[number];
        for(int i = 0; i<soldier.length; i++){
            int divisor = 0;
            for(int j = 1; j*j<=i+1; j++){
                if((i+1)%j==0){
                    if(j*j==i+1)
                        divisor++;
                    else
                        divisor+=2;
                }
            }
            soldier[i] = divisor;
        }
        int answer = 0;
        for(int i = 0; i<soldier.length; i++){
            if(soldier[i] <= limit)
                answer+=soldier[i];
            else
                answer+=power;
        }
        return answer;
    }
}