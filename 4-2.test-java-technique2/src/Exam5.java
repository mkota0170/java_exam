public class Exam5 {
    public static void main(String[] args) {
        ShoppingCart shopCart = new ShoppingCart();

        shopCart.add(new Item("アナと雪の女王",3000));
        shopCart.add(new Item("美女と野獣",2000));
        shopCart.add(new Item("モアナと伝説の海",8000));

        System.out.println(shopCart.getTotalPrice());
        System.out.println(shopCart.getAveragePrice());

    }
}
