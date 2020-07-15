package 面向对象;

public class BigDecimalTest {

    public static void main(String[] args) {

        float f = (float) 3.4;

        System.out.println(f);


        // 1
        double a = 0.5;
        double b = 0.25;

        System.out.println(a - b);
        if ((a - b) == 0.25) {
            System.out.println("no problem");
        } else {
            System.out.println("has problem");
        }

        // 2
        double a1 = 1;
        double b1 = 0.99;

        System.out.println(b1);

        short s1 = 1;
        s1 = (short) (s1 + 1);
        float price1 = 10;


        System.out.println(a1 - b1);
        if ((a1 - b1) == 0.01) {
            System.out.println("1 - 0.99 == 0.01");
        } else {
            System.out.println("1 - 0.99 != 0.01");
        }

    }


}



