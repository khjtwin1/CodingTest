import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int stuN = 0;
        int[] score = new int[5];
        for (int i = 0; i < T; i++) {
            score[i] = sc.nextInt();
        }
        if (score[0] > score[2]) {
            stuN += Math.abs(score[0] - score[2]) * 508;
        } else {
            stuN += Math.abs(score[0] - score[2]) * 108;
        }
        if (score[1] > score[3]) {
            stuN += Math.abs(score[1] - score[3]) * 212;
        } else {
            stuN += Math.abs(score[1] - score[3]) * 305;
        }
        if (T == 5) {
            stuN += score[4] * 707;
        }
        stuN *= 4763;
        System.out.println(stuN);
    }
}