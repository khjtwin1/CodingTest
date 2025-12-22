import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] value = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-", "..--..", "---...", "-....-", ".--.-."};
        char[] key = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?', ':', '-', '@'};
        HashMap<String, Character> morse = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            morse.put(value[i], key[i]);
        }

        String str = sc.nextLine();
        StringTokenizer stnz = new StringTokenizer(str, " ");

        while (stnz.hasMoreTokens()) {
            String trans = stnz.nextToken();
            System.out.print(morse.get(trans));
        }
    }
}