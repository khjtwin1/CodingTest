class Solution {
    public String solution(String my_string) {
        char[] temp=new char[my_string.length()];
        for (int i = 0; i<my_string.length(); i++)
            temp[i] = my_string.charAt(my_string.length()-i-1);
        return new String(temp);
    }
}