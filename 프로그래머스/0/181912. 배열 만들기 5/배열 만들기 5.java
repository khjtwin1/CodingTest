class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int cnt = 0;
        for(int i = 0; i<intStrs.length; i++){
            String str = "";
            for(int j = s; j < s+l; j++){
                str += intStrs[i].charAt(j);
            }
            if(Integer.parseInt(str)>k)
                cnt++;
        }
        int[] answer = new int[cnt];
        int a = 0;
        for(int i = 0; i<intStrs.length; i++){
            String str = "";
            for(int j = s; j < s+l; j++){
                str += intStrs[i].charAt(j);
            }
            if(Integer.parseInt(str)>k)
                answer[a++] = Integer.parseInt(str);
        }
        return answer;
    }
}