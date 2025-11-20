import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        for(int i = 0; i<2; i++){
            str[i] = sc.next();
        }
        int[] num = new int[2];
        for(int j = 0; j<2; j++) {
            String change = "";
            for (int i = str[j].length() - 1; i >= 0; i--) {
                change += str[j].charAt(i);
            }
            num[j] = Integer.parseInt(change);
        }
        System.out.println(num[0] > num[1] ? num[0] : num[1]);
    }
}