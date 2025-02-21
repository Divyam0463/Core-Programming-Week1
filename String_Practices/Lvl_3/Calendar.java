import java.util.Scanner;

public class Calendar {

    private static final String[] MONTH_NAMES = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (mm) and year (yyyy): ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        if (month < 1 || month > 12 || year < 1900) { // Basic validation
            System.out.println("Invalid input.");
            return;
        }

        if (isLeapYear(year)) {
            DAYS_IN_MONTH[2] = 29; // Adjust for leap year
        }

        printCalendar(month, year);
    }

    private static String getMonthName(int month) {
        return MONTH_NAMES[month];
    }

    private static int getDaysInMonth(int month, int year) {
        return (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTH[month]; // Ternary operator
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    private static void printCalendar(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // New line after Saturday
            }
        }
        System.out.println(); // newline
    }
}