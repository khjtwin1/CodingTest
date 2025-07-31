import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)<'a'){
                answer+=(char)(a.charAt(i)+32);
            }
            else
                answer+=(char)(a.charAt(i)-32);
        }
        System.out.println(answer);
    }
}