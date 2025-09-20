class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<'a')
                answer+=(char)(my_string.charAt(i)+32);
            else
                answer+=my_string.charAt(i);
        }
        char[] str = new char[answer.length()];
        for(int i = 0; i<str.length; i++){
            str[i] = answer.charAt(i);
        }
        answer = "";
        for(int i = 0; i<str.length-1; i++){
            for(int j = i+1; j<str.length; j++){
                if(str[i]>str[j]){
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            answer+=str[i];
        }
        answer+=str[str.length-1];
        return answer;
    }
}