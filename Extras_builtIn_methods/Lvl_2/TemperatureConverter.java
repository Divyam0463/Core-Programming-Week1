import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");

        int choice = scanner.nextInt();

        double convertedTemperature = 0;

        switch (choice) {
            case 1:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
                break;
            case 2:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}