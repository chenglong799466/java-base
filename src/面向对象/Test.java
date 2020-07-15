package 面向对象;

import 面向对象.packageOne.SunTest;

/**
 * 1外部类的访问修饰符只能是public或者默认default，default对在当前类或者同包类有效，子类其他包无效。
 * 2一个java文件只能有一个public的外部类
 */
class Test {

    // 内部类或者类的成员可以是4种访问修饰符。
    private String name;
    String name1;
    protected String name2;
    public String name3;

    public class InnerTest {

    }

    public static void main(String[] args) {
        // default 可以访问
        SunTest sunTest = new SunTest();


        String s = "111";
        if (s.equals("111") && s.equals("222")) {


        }
    }

}


