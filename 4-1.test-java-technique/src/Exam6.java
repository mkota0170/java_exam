import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime beforeTime = LocalDateTime.of(1543,2,10,5,12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        String afterTime1 = beforeTime.format(formatter);

        System.out.println("徳川家康の誕生日：" + afterTime1);

        LocalDateTime afterTime2 = beforeTime;

        System.out.println("一年二カ月三日四時間五分後："+plusDateTime(afterTime2, 1, 2, 3, 4, 5));
        
        // afterTime2 = afterTime2.plusYears(1);
        // afterTime2 = afterTime2.plusMonths(2);
        // afterTime2 = afterTime2.plusDays(3);
        // afterTime2 = afterTime2.plusHours(4);
        // afterTime2 = afterTime2.plusMinutes(5);
        //System.out.println("1年2ヶ月3日4時間5分後:" + afterTime2.format(formatter));
    }

    //↓暇つぶしメソッド
    public static LocalDateTime plusDateTime(LocalDateTime time,int years, int month, int days, int hours, int min){
        
        time = time.plusYears(years);
        time = time.plusMonths(month);
        time = time.plusDays(days);
        time = time.plusHours(hours);
        time = time.plusMinutes(min);

        return time;
    }
}
