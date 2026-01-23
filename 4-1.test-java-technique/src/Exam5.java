import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(2001, 10, 7);
        System.out.println("私の誕生日は" + myBirthday.getYear() + "年" + myBirthday.getMonthValue() + "月"
                + myBirthday.getDayOfMonth() + "日です。");
    }
}
