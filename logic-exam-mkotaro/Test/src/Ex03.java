public class Ex03 {
    public static void main(String[] args) {
        
        //判定したい年数
        int input = 2000;

        int result = input;
        int count = 0;
        while(input > 0){
            input = input -100;
            count++;
            ;
        }
        System.out.println(result+"年は"+ count +"世紀です");
    }
}
