class Solution {
    public String solution(int age) {
        String answer = "";
        int d = 1;
        while(d<=age){
            d*=10;
        }
        d/=10;
        while(d>0){
            answer+=(char)(age/d+97);
            age%=d;
            d/=10;
        }
        return answer;
    }
}