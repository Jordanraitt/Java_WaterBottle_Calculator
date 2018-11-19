import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void Before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.hasVolume());
    }

    @Test
    public void takeDrink(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }
}
