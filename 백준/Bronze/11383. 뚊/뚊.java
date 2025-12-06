import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] Ms = new String[N];
        boolean flag = false;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String twice = "";
            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                twice = twice + c + c;
            }
            Ms[i] = twice;
        }
        for (int i = 0; i < N; i++) {
            String M2 = sc.next();
            if (Ms[i].equals(M2)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }
}