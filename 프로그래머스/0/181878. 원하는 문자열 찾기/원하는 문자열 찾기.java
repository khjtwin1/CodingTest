class Solution {
    public int solution(String myString, String pat) {
        if(myString.length()<pat.length())
            return 0;
        String cmyString = "";
        String cpat = "";
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i)<'a')
                cmyString += (char)(myString.charAt(i)+32);
            else
                cmyString += myString.charAt(i);
        }
        for(int i = 0; i<pat.length(); i++){
            if(pat.charAt(i)<'a')
                cpat += (char)(pat.charAt(i)+32);
            else
                cpat += pat.charAt(i);
        }
        for(int i = 0; i<cmyString.length()-cpat.length()+1; i++){
            String str = "";
            for(int j = i; j<i+cpat.length(); j++){
                str += cmyString.charAt(j);
            }
            if(str.equals(cpat))
                return 1;
        }
        return 0;
    }
}