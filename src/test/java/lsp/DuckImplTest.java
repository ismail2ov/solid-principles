package lsp;

import org.junit.Before;
import org.junit.Test;

public class DuckImplTest {
    private WildDuck wildDuck;
    private ElectricalDuck electricalDuck;

    @Before
    public void setUp() {
        wildDuck = new WildDuck();
        electricalDuck = new ElectricalDuck();
    }

    @Test
    public void theDuckCanSayQuack() {
        wildDuck.quack();
        electricalDuck.quack();
    }

    @Test
    public void theDuckCanSwim() {
        wildDuck.swim();
        electricalDuck.swim();
    }

}