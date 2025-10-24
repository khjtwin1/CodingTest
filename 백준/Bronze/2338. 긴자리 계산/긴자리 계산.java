import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.subtract(bigB));
        System.out.println(bigA.multiply(bigB));
    }
}