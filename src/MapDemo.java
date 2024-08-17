
import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of map");
        int n = sc.nextInt();
        Map<Integer, String> details = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("enter rollno");
            int key = sc.nextInt();
            System.out.println("enter name");
            String value = sc.next();
            details.put(key, value);

        }
        System.out.println("enter rollno to search");
        int rollno = sc.nextInt();
        String name = details.get(rollno);
        if (name != null) {
            System.out.println("name is " + name);
        } else {
            System.out.println("rollno not found");
        }
        System.out.println("printing entire details");
        for (int k : details.keySet()) {
            System.out.println("rollno is " + k + " name is " + details.get(k));
        }
        sc.close();
    }
}
