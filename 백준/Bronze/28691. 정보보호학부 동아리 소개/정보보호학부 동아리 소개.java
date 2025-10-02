import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char say = sc.next().charAt(0);
        String fullN;
        switch (say) {
            case 'M':
                fullN = "MatKor";
                break;
            case 'W':
                fullN = "WiCys";
                break;
            case 'C':
                fullN = "CyKor";
                break;
            case 'A':
                fullN = "AlKor";
                break;
            default:
                fullN = "$clear";
        }
        System.out.println(fullN);
    }
}