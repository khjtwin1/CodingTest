class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean n1 = x1 == false && x2 == false ? false : true;
        boolean n2 = x3 == false && x4 == false ? false : true;
        boolean answer = n1 == true && n2 == true ? true : false;
        return answer;
    }
}