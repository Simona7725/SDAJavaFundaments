package ro.sda.java4.basic;

import java.util.Scanner;

/*
6.Create three variables, one for each type: float, byte and char.
Enter values corresponding to those types using Scanner.
What values are you able to enter for each type?
 */

public class BasicsEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter float value:");
        float floatValue = scanner.nextFloat();
        System.out.println("Enter byte value:");
        byte byteValue = scanner.nextByte();
        System.out.println("Enter char value:");
        char charValue = scanner.next().charAt(0);

        //print values
        System.out.println("Value for floatValue:" + floatValue);
        System.out.println("Value for byteValue:" + byteValue);
        System.out.println("Value for charValue:" + charValue);

        scanner.close();



    }
}
