package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class Basics {
    public static void main(String[] args) {
        double d = 10.5678909;
        long l=100L;

        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World!" + i);


        }
 //       System.out.printf("Hello World! %.2f" , d);

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        System.out.println(decimalFormat.format(d));

        System.out.println("String1");
        String s1 = "String1", s2 = "String2", s3 = "String3";
     //   System.out.format("%30s %30s %30s" ,s1, s2, s3);
        System.out.format("%-30s %-30s %-30s\n" ,s1, s2, s3);

        boolean flag = true;
        System.out.println("Flag value =" + String.format ("%b",flag));


    }
}
