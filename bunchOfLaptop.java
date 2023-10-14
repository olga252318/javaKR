import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bunchOfLaptop {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "promote1");
        map.put(2, "promote2");
        map.put(3, "promote3");

        Laptop laptop1 = new Laptop("Honor Magicbook X14", 69999.99, 8, map);
        Laptop laptop2 = new Laptop("Azerty AZ-1504", 59900.00, 8, map);
        Laptop laptop3 = new Laptop("Prestigio SMARTBOOK 141 C6", 50000, 4, map);
        Laptop laptop4 = new Laptop("Digma EVE 15", 45000.00, 4, map);
        Laptop laptop5 = new Laptop("Microsoft Surface Laptop Go", 65000.00, 16, map);
        Laptop laptop6 = new Laptop("Honor Magicbook X14", 69999.99, 8, map);

        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        
        for (Laptop laptop: laptopSet) {
            System.out.println(laptop);
        }
    }
}
