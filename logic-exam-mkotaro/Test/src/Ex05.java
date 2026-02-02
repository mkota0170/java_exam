import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {

        String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer",
                "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing",
                "jogging", "baseball", "soccer", "soccer" };
        Map<String, Integer> map = new HashMap<>();
        for (String name : sports) {
            Integer count = map.get(name);
            if (count == null) {
                map.put(name, 1);
            } else {
                count++;
                map.put(name, count);
            }
        }
        Set<String> keySet = map.keySet();
        String king = "";
        int result = 0;
        for (String sportName : keySet) {
            Integer count = map.get(sportName);
            if (result < count) {
                result = count;
                king = sportName;
            }
        }
        System.out.println("最も出現数の多いスポーツは" + king + "で、出現回数は" + result + "です");

    }
}
