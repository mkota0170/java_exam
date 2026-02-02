public class Ex06 {
    public static void main(String[] args) {
        double randomNum1 = Math.floor(Math.random() * 10);
        double randomNum2 = Math.floor(Math.random() * 10);
        double randomNum3 = Math.floor(Math.random() * 10);

        double num1 = randomNum1;//百の位
        double num2 = randomNum2;//十の位
        double num3 = randomNum3;//一の位

        //全部同じ数字の場合
        if (num1 == num2 && num2 == num3) {
            System.out.println((int) num1 + "" + (int) num2 + "" + (int) num3);
        //以下２つ同じ数字がある場合
        } else if (num1 == num2) {
            System.out.println((int) num1 + "" + (int) num2 + "" + (int) num3);
            System.out.println((int) num1 + "" + (int) num3 + "" + (int) num2);
            System.out.println((int) num3 + "" + (int) num1 + "" + (int) num2);

        } else if (num1 == num3) {
            System.out.println((int) num1 + "" + (int) num2 + "" + (int) num3);
            System.out.println((int) num2 + "" + (int) num1 + "" + (int) num3);
            System.out.println((int) num1 + "" + (int) num3 + "" + (int) num2);

        } else if (num2 == num3) {
            System.out.println((int) num1 + "" + (int) num2 + "" + (int) num3);
            System.out.println((int) num2 + "" + (int) num1 + "" + (int) num3);
            System.out.println((int) num2 + "" + (int) num3 + "" + (int) num1);
        //以下すべてが同じ数字の場合
        } else {
            System.out.println((int) num1 + "" + (int) num2 + "" + (int) num3);
            System.out.println((int) num1 + "" + (int) num3 + "" + (int) num2);
            System.out.println((int) num2 + "" + (int) num1 + "" + (int) num3);
            System.out.println((int) num2 + "" + (int) num3 + "" + (int) num1);
            System.out.println((int) num3 + "" + (int) num1 + "" + (int) num2);
            System.out.println((int) num3 + "" + (int) num2 + "" + (int) num1);
        }
        // 123
        // 132
        // 213
        // 231
        // 312
        // 321
    }
}
