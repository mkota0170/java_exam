import java.util.ArrayList;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("後藤");
        name.add("山田");
        name.add("佐藤");
        name.add("田中");

        name.remove(1);

        for(String names : name){
            System.out.println(names);
        }

    }
}
