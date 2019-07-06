package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class BasicsEx4 {
    public static void main(String[] args) {
        /*
        *4. Enter two values of type int. Display their division casted to
        * the double type and rounded to the third decimal point
         */

        int value1 = 100, value2 = 7;
        double value1_double = (double)value1;
        double result = (double)value1/value2;


        System.out.println("Result = " + result);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("Result rounded = " + decimalFormat.format(result));
    }
}
