import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String retake = sc.next();
        String code = "";
        int admit = 0;
        for (int i = 0; i < 5; i++) {
            code += retake.charAt(i);
        }
        int N = sc.nextInt();
        String[] retakeN = new String[N];
        String[] retakeC = new String[N];
        for (int i = 0; i < N; i++) {
            retakeC[i] = "";
            retakeN[i] = sc.next();
            for (int j = 0; j < 5; j++) {
                retakeC[i] += retakeN[i].charAt(j);
            }
            if (code.equals(retakeC[i])) {
                admit++;
            }
        }
        System.out.println(admit);
    }
}