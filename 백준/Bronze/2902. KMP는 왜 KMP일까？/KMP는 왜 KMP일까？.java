import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        String answer = "";
        String[] name = names.split("-");
        for (int i = 0; i < name.length; i++) {
            answer += name[i].charAt(0);
        }
        System.out.println(answer);
    }
}