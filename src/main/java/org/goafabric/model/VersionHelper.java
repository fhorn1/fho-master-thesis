package org.goafabric.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Utility class to handle the internal version
 *
 * @author Felix Horn
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VersionHelper {

    private static final String KBV_INTERVAL_DATE_DELEMITER = "\\.\\.";
    private static final DateTimeFormatter LOCAL_DATE_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd");

    /**
     * extract start date from specific structure
     *
     * @param dateString - startDate in string (for example: 2020-01-01..2020-03-31)
     * @return non null {@link LocalDate}
     */
    public static LocalDate extractStartDate(String dateString) {
        if (dateString.length() == 5) { // date sting is from xdt file and quarter related (f.e. 42021)
            return getFirstDateInQuarter(Integer.parseInt(dateString.substring(1)),
                    Integer.parseInt(dateString.substring(0, 1)));
        }
        String[] dates = dateString.split(KBV_INTERVAL_DATE_DELEMITER);
        if (dates[0] != null && dates[0].length() == 10) {
            return LocalDate.parse(dates[0], LOCAL_DATE_FORMAT);
        }
        throw new IllegalArgumentException("Validation string " + dateString + "has not a correct syntax.");
    }

    /**
     * extract end date from specific structure
     *
     * @param dateString - endDate in string (for example: 2020-01-01..2020-03-31)
     * @return non null {@link LocalDate} or null if no endDate exists
     */
    public static LocalDate extractEndDate(String dateString) {
        if (dateString.length() == 5) { // date sting is from xdt file and quarter related (f.e. 42021)
            return getLastDateInQuarter(Integer.parseInt(dateString.substring(1)),
                    Integer.parseInt(dateString.substring(0, 1))).plusDays(1);
        }
        String[] dates = dateString.split(KBV_INTERVAL_DATE_DELEMITER);
        if (dates.length != 2) {
            return null;
        } else if (dates[1] != null && dates[1].length() == 10) {
            return LocalDate.parse(dates[1], LOCAL_DATE_FORMAT).plusDays(1);
        }
        throw new IllegalArgumentException("Validation string " + dateString + "has not a correct syntax.");
    }

    /**
     * get internal version
     *
     * @return internal version
     */
    public static String versionFromDate(LocalDate date) {
        int quarter;
        switch (date.getMonthOfYear()) {
            case 1:
            case 2:
            case 3:
                quarter = 1;
                break;
            case 4:
            case 5:
            case 6:
                quarter = 2;
                break;
            case 7:
            case 8:
            case 9:
                quarter = 3;
                break;
            case 10:
            case 11:
            case 12:
                quarter = 4;
                break;
            default:
                throw new IllegalStateException();
        }
        return date.getYear() + ".Q" + quarter;
    }

    private static LocalDate getFirstDateInQuarter(int year, int quarter) {
        switch (quarter) {
            case 1:
                return new LocalDate(year, 1, 1);
            case 2:
                return new LocalDate(year, 3, 1);
            case 3:
                return new LocalDate(year, 7, 1);
            case 4:
                return new LocalDate(year, 10, 1);
            default:
                throw new IllegalStateException();
        }
    }

    private static LocalDate getLastDateInQuarter(int year, int quarter) {
        switch (quarter) {
            case 1:
                return new LocalDate(year, 3, 31);
            case 2:
                return new LocalDate(year, 6, 30);
            case 3:
                return new LocalDate(year, 9, 30);
            case 4:
                return new LocalDate(year, 12, 31);
            default:
                throw new IllegalStateException();
        }
    }
}
