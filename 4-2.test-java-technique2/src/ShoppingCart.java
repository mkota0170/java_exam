import java.util.LinkedList;
public class ShoppingCart extends LinkedList<Item>{
    
    //List<Item> item = new ArrayList<>();

    public int getTotalPrice(){
        int total=0;
        for(Item cart : this){
            total = total + cart.getPrice();
        }
        return total;
    }

    public int getAveragePrice(){
        return getTotalPrice()/this.size();//this-->item
    }
    }
