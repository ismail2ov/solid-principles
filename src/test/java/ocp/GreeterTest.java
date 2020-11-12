package ocp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        AnyPersonality personality = new AnyPersonality();
        Greeter greeter = new Greeter(personality);

        String actual = greeter.greet();

        assertEquals("Hello.", actual);
    }

    @Test
    public void testSaysHelloFormally() {
        FormalPersonality personality = new FormalPersonality();
        Greeter greeter = new Greeter(personality);

        String actual = greeter.greet();

        assertEquals("Good evening, sir.", actual);
    }

    @Test
    public void testSaysHelloCasually() {
        CasualPersonality personality = new CasualPersonality();
        Greeter greeter = new Greeter(personality);

        String actual = greeter.greet();

        assertEquals("Sup bro?", actual);
    }

    @Test
    public void testSaysHelloIntimately() {
        IntimatePersonality personality = new IntimatePersonality();
        Greeter greeter = new Greeter(personality);

        String actual = greeter.greet();

        assertEquals("Hello Darling!", actual);
    }
}
