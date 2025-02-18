import java.util.Scanner;

public class Calendar {

    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 // Index 0 is not used
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (MM) and year (YYYY): ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        displayCalendar(month, year);
        scanner.close();
    }

    static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        //for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day of the week
        }

        // Displaying the days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); // Right-aligned with width 3

            if ((firstDay + day - 1) % 7 == 6) { // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    static String getMonthName(int month) {
        return MONTH_NAMES[month - 1]; // Array is 0-index,  months are 1-index
    }

    static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        } else {
            return DAYS_IN_MONTH[month];
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
}
