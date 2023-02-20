/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.digitdisplay;
import java.util.Scanner;
/**
 *
 * @author sukhm
 */
public class DigitDisplay {

    
    public static int Quotient(int a, int b) {
        return a / b;
    }
    
    public static int Remainder(int a, int b) {
        return a % b;
    }
    
    public static void displayDigits(int number) {
        int divisor = 10000;
        int digit;
    
        while (divisor >= 1) {
            digit = Quotient(number, divisor);
            System.out.printf("%d  ", digit);
            number = Remainder(number, divisor);
            divisor = Quotient(divisor, 10);
        }
    }
    
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter a number between 1 and 99999 to get"
                + "the thousandths, hundredths, tenths, and ones place");
      Scanner scanner = new Scanner(System.in);
      number = scanner.nextInt();
        displayDigits(number);
       
    }
}
