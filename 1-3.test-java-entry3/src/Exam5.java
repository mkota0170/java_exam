public class Exam5 {
    public static void main(String[] args) {
        System.out.println(addition(5, 3));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(5, 3));
        System.out.println(division(5, 3));
        System.out.println(remainder(5, 3));
    }
    static int addition(int num1, int num2){
        return (num1 + num2);
    }
    static int subtraction(int num1, int num2){
        return (num1 - num2);
    }
    static int multiplication(int num1, int num2){
        return (num1 * num2);
    }
    static int division(int num1, int num2){
        return (num1 / num2);
    }
    static int remainder(int num1, int num2){
        return (num1 % num2);
    }
}
