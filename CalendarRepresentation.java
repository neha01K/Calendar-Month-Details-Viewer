import java.text.DateFormatSymbols;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt() - 1; // Adjusting for 0-based month index

        Calendar calendar = new GregorianCalendar(year, month, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        String monthName = new DateFormatSymbols().getMonths()[month];

        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1) + " or " + monthName);
        System.out.println("Days in Month: " + daysInMonth);

        sc.close();
    }
}
