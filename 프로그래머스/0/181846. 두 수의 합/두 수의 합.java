import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger ac = new BigInteger(a);
        BigInteger bc = new BigInteger(b);
        String answer = ac.add(bc).toString();
        return answer;
    }
}