package nit.GITProj01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWithPositive() {
    	App app=new App();
    	int expected=8;
    	int actual=app.sum(4, 4);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testWithNegative() {
    	App app=new App();
    	int expected=-8;
    	int actual=app.sum(-4, -4);
        assertEquals(expected,actual);
    }
    
    
    
}
