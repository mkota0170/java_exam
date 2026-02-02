public class Ex01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j < 10) {
                    System.out.printf("0%d", i * j);
                } else {
                    System.out.printf("%d", i * j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
