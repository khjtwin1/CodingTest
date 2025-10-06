class Solution {
    public String[] solution(String[] strArr) {
        int cnt = strArr.length;
        boolean[] tf = new boolean[strArr.length];
        for(int i = 0; i<strArr.length; i++){
            for(int j = 0; j<strArr[i].length()-1; j++){
                String check = "";
                for(int k = j; k<j+2; k++){
                    check += strArr[i].charAt(k);
                }
                if(check.equals("ad")){
                    cnt--;
                    tf[i] = true;
                    break;
                }
            }
        }
        String[] answer = new String[cnt];
        int k = 0;
        for(int i = 0; i<strArr.length; i++){
            if(tf[i]==false){
                answer[k] = strArr[i];
                k++;
            }
        }
        return answer;
    }
}