import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2005, 7, 1);
        LocalDate localDate2 = LocalDate.of(2005, 1, 2);
        LocalDate localDate3 = LocalDate.of(2005, 1, 1);
        LocalDate localDate4 = LocalDate.of(2005, 5, 3);
        LocalDate localDate5 = LocalDate.of(2005, 10, 9);
        List<LocalDate> unsortedDates = List.of(localDate1, localDate2, localDate3, localDate4, localDate5);
        IDateSorterImpl iDateSorter = new IDateSorterImpl();
        System.out.println("Unsorted list: " + unsortedDates);
        System.out.println("Sorted list: " + iDateSorter.sortDates(unsortedDates));
    }
}