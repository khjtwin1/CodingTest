import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char yut;
        for(int j = 0; j<3; j++) {
            int cnt = 0;
            for (int i = 0; i < 4; i++) {
                int n = sc.nextInt();
                if (n == 0)
                    cnt++;
            }
            switch (cnt) {
                case 1:
                    yut = 'A';
                    break;
                case 2:
                    yut = 'B';
                    break;
                case 3:
                    yut = 'C';
                    break;
                case 4:
                    yut = 'D';
                    break;
                default:
                    yut = 'E';
            }
            System.out.println(yut);
        }
    }
}