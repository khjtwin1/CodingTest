import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int address = sc.nextInt();
            if (address == 0)
                return;
            String adChange = Integer.toString(address);
            int length = adChange.length() + 1;
            for (int i = 0; i < adChange.length(); i++) {
                if (adChange.charAt(i) == '1')
                    length += 2;
                else if (adChange.charAt(i) == '0') {
                    length += 4;
                } else
                    length += 3;
            }
            System.out.println(length);
        }
    }
}