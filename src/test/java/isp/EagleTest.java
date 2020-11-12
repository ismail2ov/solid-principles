package isp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EagleTest {
    @Test
    public void testItCanFly() {
        Eagle eagle = new Eagle();
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItEating() {
        Eagle eagle = new Eagle();
        eagle.eat();
    }
}
