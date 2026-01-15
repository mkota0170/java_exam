public class Exam3 {
    public static void main(String[] args) {
        int a = 200;
        int b = 250;
        final double TAX = 0.1;
        int total = a * 3 + b * 4;
        
        System.out.println("小計\n"+total + "円");
        System.out.println("消費税\n"+(int)(total * TAX)+ "円");
        System.out.println("合計金額\n"+(int)(total + total*TAX)+ "円");

    }
}
