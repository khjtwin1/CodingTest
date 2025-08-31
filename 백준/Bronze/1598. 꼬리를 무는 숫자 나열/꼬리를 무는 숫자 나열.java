import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int answer = 0;
        int x1 = (n1 % 4 == 0) ? n1 / 4 : n1 / 4 + 1;
        int y1 = (n1 % 4 == 0) ? 4 : n1 % 4;
        int x2 = (n2 % 4 == 0) ? n2 / 4 : n2 / 4 + 1;
        int y2 = (n2 % 4 == 0) ? 4 : n2 % 4;

        if (x1 > x2) {
            answer += x1 - x2;
        } else {
            answer += x2 - x1;
        }
        if (y1 > y2) {
            answer += y1 - y2;
        } else {
            answer += y2 - y1;
        }
        System.out.println(answer);
    }
}