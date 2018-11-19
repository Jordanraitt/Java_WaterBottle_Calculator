import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void calcAdd(){
//        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calcAdd(1,1));
    }

    @Test
    public void clacSub(){
//        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calcSub(1,1));
    }

    @Test
    public void calcMulti(){
        assertEquals(4,calculator.calcMulti(2,2));
    }

    @Test
    public void calcDiv(){
        assertEquals(2, calculator.calcDiv(4,2));
    }

}
