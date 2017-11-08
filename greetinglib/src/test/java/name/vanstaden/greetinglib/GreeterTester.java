package name.vanstaden.greetinglib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author grantvanstaden
 * @since 8/11/17.
 */

public class GreeterTester {
    @Test
    public void greetsNullAsAnonymous() {
        Greeter greeter = new Greeter();
        String greeting = greeter.greet(null);
        assertEquals("Hello anonymous", greeting);
    }

    @Test
    public void greetsEmptyAsAnonymous() {
        Greeter greeter = new Greeter();
        String greeting = greeter.greet("");
        assertEquals("Hello anonymouse", greeting);
    }
}
