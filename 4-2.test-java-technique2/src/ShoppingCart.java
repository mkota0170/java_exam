import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList{
    
    List<Item> item = new ArrayList<>();

    public int getTotalPrice(){
        int total=0;
        for(Item cart : item){
            total = total + cart.getPrice();
        }
        return total;
    }

    public int getAveragePrice(){
        return getTotalPrice()/item.size();
    }

}
