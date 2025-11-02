class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for(int idx = 0; idx<code.length(); idx++){
            if(mode==0){
                if(code.charAt(idx)!='1' && idx%2==0){
                    ret+=code.charAt(idx);
                }
                else if(code.charAt(idx)=='1')
                    mode = 1;
            }
            else{
                if(code.charAt(idx)!='1' && idx%2==1){
                    ret+=code.charAt(idx);
                }
                else if(code.charAt(idx)=='1')
                    mode = 0;
            }
        }
        if(ret.equals("")){
            return "EMPTY";
        }
        return ret;
    }
}