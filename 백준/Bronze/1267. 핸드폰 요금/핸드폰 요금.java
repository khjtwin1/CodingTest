import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int YP = 0, MP = 0;
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            YP += (T + 30) / 30 * 10;
            MP += (T + 60) / 60 * 15;
        }
        if (YP > MP)
            System.out.println("M " + MP);
        else if(YP < MP)
            System.out.println("Y " + YP);
        else
            System.out.println("Y M " + YP);
    }
}