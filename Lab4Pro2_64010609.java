import java.util.GregorianCalendar;

public class Lab4Pro2_64010609 {
    public static void main(String[] args) {

        
        // current date
        System.out.println("Current year, month, date, and day of week");
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.printf("Year: %d \nMonth: %d \nDay: %d\n",
                calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DATE),calendar.getTime());
        System.out.println("Day of week is "+calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("----------");

        calendar.add(GregorianCalendar.DATE, 1);
        
        // day after current day
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.printf("Year: %d \nMonth: %d \nDay: %d\n",
                calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DATE),calendar.getTime());
        System.out.println("Day of week is "+calendar.get(GregorianCalendar.DAY_OF_WEEK));        
        System.out.println(calendar.getTime());
    }
}
