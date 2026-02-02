public class Ex04 {
    public static void main(String[] args) {
        //判定したい年数
        int judgeYear = 2000;

        if (judgeUru(judgeYear) == true) {
            System.out.println(judgeYear + "年はうるう年");
        } else {
            System.out.println(judgeYear + "年はうるう年ではありません");
        }

    }

    public static boolean judgeUru(int year) {
        boolean result = false;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            result = true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        }
        return result;

    }
}
