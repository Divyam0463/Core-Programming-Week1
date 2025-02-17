import java.util.Scanner;

public class calc {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double first = s.nextDouble();
    double second = s.nextDouble();
    String op = s.next();

    double ans = 0.0;

    switch (op) {
      case "+":
        ans = first + second;
        break;
      case "-":
        ans = first - second;
        break;
      case "/":
        ans = first / second;
        break;
      case "*":
        ans = first * second;
        break;
      default:
        System.out.println("Invalid Operator");
        return ;
    }

    System.out.println(ans);
  }
}
