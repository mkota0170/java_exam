import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<String> list = new ArrayList<>();

        list.add("まつはな");
        list.add("ひろたか");

        for(String names : list){
            System.out.println(names);
        }
        
        Map<String,Integer> map = new HashMap<>();

        map.put("松花",1);
        map.put("前川", 2);

        
        
        for(String namess: map.keySet()){
            System.out.println(namess+"の苗字は"+map.get(namess));
        }

            //SHopCartは最初にクラスでインスタンス化

    }
}
