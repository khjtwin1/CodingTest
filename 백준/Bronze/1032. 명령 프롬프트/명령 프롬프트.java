import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] file = new String[N];
        for (int i = 0; i < N; i++) {
            file[i] = sc.next();
        }
        boolean[] same = new boolean[file[0].length()];
        for (int i = 0; i < file[0].length(); i++) {
            for (int j = 1; j < file.length; j++) {
                if (file[0].charAt(i) != file[j].charAt(i))
                    same[i] = true;
            }
            if (same[i] == false)
                System.out.print(file[0].charAt(i));
            else
                System.out.print("?");
        }
    }
}