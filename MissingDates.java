import java.util.ArrayList;
import java.util.List;

class DateAndTime
{
    int day;
    int month;
    int year;
    DateAndTime(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
public class MissingDates {
    public static void main(String[] args) {
        ArrayList<DateAndTime> list = new ArrayList<>();

        list.add(new DateAndTime(1, 3, 2022));
        list.add(new DateAndTime(1, 4, 2022));
        //list.add(new DateAndTime(1, 5, 2022));
        list.add(new DateAndTime(1, 6, 2022));
        list.add(new DateAndTime(1, 7, 2022));
        list.add(new DateAndTime(1, 8, 2022));
        list.add(new DateAndTime(1, 9, 2022));
        //list.add(new DateAndTime(1, 10, 2022));
        list.add(new DateAndTime(1, 11, 2022));
        list.add(new DateAndTime(1, 12, 2022));
        //list.add(new DateAndTime(1, 1, 2023));
        list.add(new DateAndTime(1, 2, 2023));
        list.add(new DateAndTime(1, 3, 2023));
        //list.add(new DateAndTime(1, 4, 2023));
        list.add(new DateAndTime(1, 5, 2023));

        List<DateAndTime> missingDates = findMissingDates(list);

        System.out.println("Missing Dates:");
        for (DateAndTime date : missingDates)
            System.out.println(date);
    }

    public static List<DateAndTime> findMissingDates(ArrayList<DateAndTime> dates) {
        List<DateAndTime> missingDates = new ArrayList<>();

        for (int i = 0; i < dates.size() - 1; i++) {
            DateAndTime current = dates.get(i);
            DateAndTime next = dates.get(i + 1);

            if (getMonthDifference(current, next) > 1) {
                int missingMonth = current.month + 1;
                int missingYear = current.year;

                if (missingMonth > 12) {
                    missingMonth = 1;
                    missingYear++;
                }

                DateAndTime missingDate = new DateAndTime(1, missingMonth, missingYear);
                missingDates.add(missingDate);
            }
        }

        return missingDates;
    }
    public static int getMonthDifference(DateAndTime date1, DateAndTime date2) {
        int yearDiff = date2.year - date1.year;
        int monthDiff = date2.month - date1.month;
        return (yearDiff * 12) + monthDiff;
    }
}
