import java.util.Currency;
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USD ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Moi nhap so tien:");
    USD = sc.nextDouble();
        double Currency = USD * 23000;
        System.out.print("Gia tri VND:" + Currency);
    }
}
