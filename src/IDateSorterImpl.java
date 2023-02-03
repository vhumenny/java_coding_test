import java.time.LocalDate;
import java.util.*;

public class IDateSorterImpl implements IDateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
     * would sort to
     * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> sortedDates = new ArrayList<>();

        unsortedDates.stream().filter(localDate -> localDate.getMonth().toString().toLowerCase().contains("r")).
                sorted().forEachOrdered(sortedDates::add);
        unsortedDates.stream().filter(localDate -> !localDate.getMonth().toString().toLowerCase().contains("r")).
                sorted(Comparator.reverseOrder()).forEachOrdered(sortedDates::add);
        return sortedDates;
    }
}
