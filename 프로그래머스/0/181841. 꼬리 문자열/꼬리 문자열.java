class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            boolean tf = false;
            for(int j = 0; j<str_list[i].length()-ex.length()+1; j++){
                String check = "";
                for(int k = j; k<j+ex.length(); k++){
                    check += str_list[i].charAt(k);
                }
                if(check.equals(ex))
                    tf = true;
            }
            if(tf==false){
                answer+= str_list[i];
            }
        }
        return answer;
    }
}