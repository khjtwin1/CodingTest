import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tempX = new int[3];
        int[] tempY = new int[3];
        for (int i = 0; i < 3; i++) {
            tempX[i] = sc.nextInt();
            tempY[i] = sc.nextInt();
        }
        int x, y;
        if (tempX[0] == tempX[1] && tempX[0] != tempX[2])
            x = tempX[2];
        else if (tempX[0] == tempX[2] && tempX[0] != tempX[1])
            x = tempX[1];
        else
            x = tempX[0];

        if (tempY[0] == tempY[1] && tempY[0] != tempY[2])
            y = tempY[2];
        else if (tempY[0] == tempY[2] && tempY[0] != tempY[1])
            y = tempY[1];
        else
            y = tempY[0];

        System.out.println(x + " " + y);
    }
}