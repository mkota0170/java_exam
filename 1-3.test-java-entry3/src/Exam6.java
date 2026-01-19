public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(10,5,'+'));
        System.out.println(calc(10,5,'-'));
        System.out.println(calc(10,5,'*'));
        System.out.println(calc(10,5,'/'));
        System.out.println(calc(10,5,'@'));
    }
    static int calc(int num1, int num2, char howTo){
        int result = 0;

        if(howTo == '+'){
            result = (num1 + num2);
        } else if(howTo == '-'){
            result = (num1 - num2);
        } else if(howTo == '*'){
            result = (num1 * num2);
        } else if(howTo == '/'){
            result = (num1 / num2);
        } else {
            result = -1;
        }
        return result;
    }
}
