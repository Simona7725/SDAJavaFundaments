package ro.sda.java4.basic;

public class BasicsEx5 {
    public static void main(String[] args) {
        int maxValue1 = Integer.MAX_VALUE, maxValue2=Integer.MAX_VALUE;

        System.out.println("Max integer:" + (maxValue1));
        System.out.println("Max integer+1:" + (maxValue1 + 1));
        System.out.println("Sum of 2 max integers:" + (maxValue1 + maxValue2));
        System.out.println("Sum of 2 max integers with casting to long:" + (long) (maxValue1 + maxValue2));
        System.out.println("Sum of 2 max integers with casting to long:" + (long)(maxValue1 + maxValue2));

    }
}
