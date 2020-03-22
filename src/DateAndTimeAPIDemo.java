import java.time.*;

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

        LocalDate birthday = LocalDate.of(1986,3,14);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday,today);
        System.out.printf("Your age is %d years %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
        System.out.println("");

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(la);
        System.out.println(zdt);
    }
}
