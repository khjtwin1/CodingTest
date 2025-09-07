import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        double r = 0;
        if (score.equals("A+")) {
            r = 4.3;
        } else if (score.equals("A0")) {
            r = 4.0;
        } else if (score.equals("A-")) {
            r = 3.7;
        } else if (score.equals("B+")) {
            r = 3.3;
        } else if (score.equals("B0")) {
            r = 3.0;
        } else if (score.equals("B-")) {
            r = 2.7;
        } else if (score.equals("C+")) {
            r = 2.3;
        } else if (score.equals("C0")) {
            r = 2.0;
        } else if (score.equals("C-")) {
            r = 1.7;
        } else if (score.equals("D+")) {
            r = 1.3;
        } else if (score.equals("D0")) {
            r = 1.0;
        } else if (score.equals("D-")) {
            r = 0.7;
        } else {
            r = 0.0;
        }
        System.out.println(r);
    }
}