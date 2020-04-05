import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        // e.g date = 2019-11-24  ,Sunday
       // 2019-11-01 , Friday
        LocalDate date = LocalDate.now(); // = 2019-11-24 - get current date

        int month = date.getMonthValue(); // = 11
        int today = date.getDayOfMonth(); // = 24

        date = date.minusDays( today - 1); // =  2019-11-01 set to start of  month .

        DayOfWeek weekday = date.getDayOfWeek(); // = Friday (2019-11-01 was friday)
        int value = weekday.getValue(); // = 5 (1 = monday , ..... 7 = sunday )

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i =1; i < value; i++)
            System.out.print("    "); // this will print initial space-- 3-spaces at a time,

        while( date.getMonthValue()  == month){
            System.out.printf("%3d", date.getDayOfMonth());

            if(date.getDayOfMonth() == today)
                System.out.print("*");
                else
                    System.out.print(" ");

                date = date.plusDays(1);

                if (date.getDayOfWeek().getValue() == 1)
                    System.out.println(); // this will print  new line
        }

        if (date.getDayOfWeek().getValue() !=1 )
            System.out.println();
    }
}
