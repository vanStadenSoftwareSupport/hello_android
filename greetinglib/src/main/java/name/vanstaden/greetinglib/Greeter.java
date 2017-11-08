package name.vanstaden.greetinglib;

/**
 * @author grantvanstaden
 * @since 8/11/17.
 */

public class Greeter {
    public String greet(String who) {
        if (who == null || who.isEmpty()) {
            who = "anonymous";
        }

        return "Hello " + who;
    }
}
