import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        switch (S) {
            case "fdsajkl;":
            case "jkl;fdsa":
                System.out.println("in-out");
                break;
            case "asdf;lkj":
            case ";lkjasdf":
                System.out.println("out-in");
                break;
            case "asdfjkl;":
                System.out.println("stairs");
                break;
            case ";lkjfdsa":
                System.out.println("reverse");
                break;
            default:
                System.out.println("molu");
        }
    }
}