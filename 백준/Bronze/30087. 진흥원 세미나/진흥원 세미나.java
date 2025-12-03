import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> seminar = new HashMap<>();
        seminar.put("Algorithm", "204");
        seminar.put("DataAnalysis", "207");
        seminar.put("ArtificialIntelligence", "302");
        seminar.put("CyberSecurity", "B101");
        seminar.put("Network", "303");
        seminar.put("Startup", "501");
        seminar.put("TestStrategy", "105");

        int N = sc.nextInt();
        String[] application = new String[N];
        for(int i = 0; i<N; i++){
            String which = sc.next();
            System.out.println(seminar.get(which));
        }
    }
}