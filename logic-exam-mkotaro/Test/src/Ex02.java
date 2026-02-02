
import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args) {
        //何時
        int hour = 11;
        //何分
        int min =59;
        //何秒
        int sec = 59;

        LocalDateTime time = LocalDateTime.of(2025, 2, 1, hour, min,sec);
        LocalDateTime afterTime = time.plusSeconds(1);

        System.out.print(hour +"時"+min +"分"+ sec + "秒の1秒後は\n"+afterTime.getHour() +"時"+afterTime.getMinute() +"分"+ afterTime.getSecond() +"秒");
    }
}
