class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int i = 0;
        String answer = "";
        while(i<letter.length()){
            String str = "";
            while(i<letter.length() && letter.charAt(i)!=' '){
                str += letter.charAt(i++);
            }
            if(i<letter.length() && letter.charAt(i)==' ')
                i++;
            for(int j = 0; j<morse.length; j++){
                if(str.equals(morse[j])){
                    answer+=(char)(j+'a');
                    break;
                }
            }
        }
        return answer;
    }
}