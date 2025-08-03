class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i<strArr.length; i++){
            answer[i] = "";
            if(i%2==1){
                for(int j = 0; j<strArr[i].length(); j++){
                    if(strArr[i].charAt(j)>'Z'){
                        answer[i]+=(char)(strArr[i].charAt(j)-32);
                    }
                    else
                        answer[i]+=strArr[i].charAt(j);
                }
            }
            else{
                for(int j = 0; j<strArr[i].length(); j++){
                    if(strArr[i].charAt(j)<'a'){
                        answer[i]+=(char)(strArr[i].charAt(j)+32);
                    }
                    else
                        answer[i]+=strArr[i].charAt(j);
                }
            }
        }
        return answer;
    }
}