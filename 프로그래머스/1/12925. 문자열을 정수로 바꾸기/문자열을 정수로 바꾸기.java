class Solution {
    public int solution(String s) {
        int answer = 0;
        int l;
        int length = s.length();
        int i;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            i = 1;
            length -= 1;
        }
        else{
            i = 0;
        }
        switch(length){
            case 1: l = 1;
                break;
            case 2: l = 10;
                break;
            case 3: l = 100;
                break;
            case 4: l = 1000;
                break;
            default: l = 10000;
        }
        for(; i<s.length(); i++){
            answer += (int)(s.charAt(i)-'0')*l;
            l/=10;
        }
        if(s.charAt(0)=='-'){
            answer *= -1;
        }
        return answer;
    }
}