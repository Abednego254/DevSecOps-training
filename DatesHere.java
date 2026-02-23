import java.time.LocalDate;
import java.time.LocalDateTime;

public class DatesHere {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("Date = "+ localDate);
        localDate = localDate.plusHours(1);
    }


}
