import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatCurrance {
  static String printCurrency(Locale locale, Double payment) {
    NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
    String currency = formatter.format(payment);
    return currency;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    // Write your code here.

    System.out.println("US: " + printCurrency(Locale.US, payment));
    System.out.println("India: " + printCurrency(new Locale("en", "IN"), payment));
    System.out.println("China: " + printCurrency(Locale.CHINA, payment));
    System.out.println("France: " + printCurrency(Locale.FRANCE, payment));
  }
}
