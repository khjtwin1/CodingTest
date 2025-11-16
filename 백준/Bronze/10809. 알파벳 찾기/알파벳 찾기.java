import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[26];

        String S = sc.next();
        for(int i = 0; i<26; i++){
            boolean flag = false;
            for(int j = 0; j<S.length(); j++){
                if((char)(i+'a')==S.charAt(j)){
                    System.out.print(j+" ");
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                System.out.print(-1+" ");
        }
    }
}