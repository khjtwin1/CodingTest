class Solution {
    public int solution(String n_str) {
        int answer = 0;
        int mul;
        switch (n_str.length()){
            case 1: mul = 1;
                break;
            case 2: mul = 10;
                break;
            case 3: mul = 100;
                break;
            case 4: mul = 1000;
                break;
            default: mul = 10000;
        }
        for(int i = 0; i<n_str.length(); i++){
            answer += (int)(n_str.charAt(i)-'0')*mul;
            mul/=10;
        }
        return answer;
    }
}