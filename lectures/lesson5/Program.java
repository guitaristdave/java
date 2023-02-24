import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "null");
        // System.out.println(db.containsKey(1));

        for (var item : db.entrySet()) {
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }
    }
}