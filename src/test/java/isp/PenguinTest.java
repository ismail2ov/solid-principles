package isp;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PenguinTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin();
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }

    @Test
    public void testItEating() {
        Penguin penguin = new Penguin();
        penguin.eat();
    }
}
