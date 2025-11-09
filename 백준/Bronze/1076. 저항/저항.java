import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);

        int c1 = map.get(sc.next());
        int c2 = map.get(sc.next());
        int c3 = map.get(sc.next());
        long answer = (c1 * 10 + c2) * (long)(Math.pow(10,c3));
        System.out.println(answer);
    }
}