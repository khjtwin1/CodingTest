import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int J = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        int can = 0;
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int size = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    size += 1;
                } else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    size += 4;
                } else {
                    size += 2;
                }
            }
            if (J >= size) can++;
        }
        System.out.println(can);
    }
}