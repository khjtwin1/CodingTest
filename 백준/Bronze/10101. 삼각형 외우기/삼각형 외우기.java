import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ang1 = sc.nextInt();
        int ang2 = sc.nextInt();
        int ang3 = sc.nextInt();

        if (ang1 + ang2 + ang3 != 180)
            System.out.println("Error");
        else if (ang1 == 60 && ang2 == 60 && ang3 == 60)
            System.out.println("Equilateral");
        else if (ang1 == ang2 || ang1 == ang3 || ang2 == ang3)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}