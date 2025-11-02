class Solution {
    public int solution(int[][] dots) {
        int Mx = dots[0][0], My = dots[0][1], mx = dots[0][0], my = dots[0][1];
        for(int i = 1; i<4; i++){
            if(dots[i][0]>Mx)
                Mx = dots[i][0];
            else if(dots[i][0]<mx)
                mx = dots[i][0];
            
            if(dots[i][1]>My)
                My = dots[i][1];
            else if(dots[i][1]<my)
                my = dots[i][1];
        }
        int answer = (Mx-mx)*(My-my);
        return answer;
    }
}