package hello;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * @author pengfei.zhao
 * @date 2020/9/30 7:32
 */
public class GreetingTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello(){
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
