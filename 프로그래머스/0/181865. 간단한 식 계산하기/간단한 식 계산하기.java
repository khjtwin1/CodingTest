class Solution {
    public int solution(String binomial) {
        int n = 0;
        String n1 = "";
        while(binomial.charAt(n)!=' '){
            n1+=binomial.charAt(n);
            n++;
        }
        n++;
        char sign = binomial.charAt(n);
        n+=2;
        String n2 = "";
        while(n<binomial.length()){
            n2+=binomial.charAt(n);
            n++;
        }
        int n1ch = Integer.parseInt(n1);
        int n2ch = Integer.parseInt(n2);
        switch(sign){
            case '+': return n1ch + n2ch;
            case '-': return n1ch - n2ch;
            case '*': return n1ch * n2ch;
            default: return n1ch / n2ch;
        }
    }
}