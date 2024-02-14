package javabasic;
import java.util.Scanner;

public class Bin2Dec_checked {
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();

        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + decimal);
    }
}