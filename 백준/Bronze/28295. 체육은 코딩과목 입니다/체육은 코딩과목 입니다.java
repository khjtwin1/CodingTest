import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turn = 0;
        for(int i = 0; i<10; i++){
            int t = sc.nextInt();
            switch (t){
                case 1: turn += 90; break;
                case 2: turn += 180; break;
                case 3: turn -= 90;
            }
        }
        turn %= 360;
        if(turn<0)
            turn += 360;
        switch (turn) {
            case 0:
                System.out.println("N"); break;
            case 90:
                System.out.println("E"); break;
            case 180:
                System.out.println("S"); break;
            case 270:
                System.out.println("W"); break;
        }
    }
}