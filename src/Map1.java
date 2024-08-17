import java.util.Map;
import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> cars=new HashMap<>();
        cars.put("BMW", "Black");
        cars.put("Audi", "White");
        cars.put("Mercedes", "Red");
        cars.put("BMW", "orange");
        cars.put("Mustang","charcoal");
        System.out.println(cars);
    }
}
