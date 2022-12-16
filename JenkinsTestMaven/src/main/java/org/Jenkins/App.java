package org.Jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Entity e = new Entity("Hello My name is Kevin, I created this very very basic SpringBoot app just to test on Jenkins Server");
        System.out.println(e.getMessage());
        System.out.println(e.calculate(5, 6, '*'));
        System.out.println(e.calculate(3, 3, '/'));
        System.out.println(e.calculate(10, 45, '+'));
        System.out.println(e.calculate(36, 12, '-'));
    }
}
