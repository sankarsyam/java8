import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeAPIDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(time);

        int dd= date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(dd+"-"+mm+"-"+yyyy);
        System.out.printf("%d-%d-%d", dd,mm,yyyy);

        int hour = time.getHour();
        int minute = time.getMinute();
        int seconds = time.getSecond();
        int nanoseconds = time.getNano();
        System.out.println(" Time");
        System.out.printf("%d-%d-%d-%d",hour,minute,seconds,nanoseconds);

        LocalDateTime dt= LocalDateTime.now();
        System.out.println("");
        System.out.println("Local Date Time :"+dt);
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());

    }
}
