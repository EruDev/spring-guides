package hello;


import org.joda.time.LocalTime;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 7:18
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime localTime = new LocalTime();
        System.out.println("The current local time is :" + localTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
