package nit.GITProj01;





import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @Test
    public void testWithNegative1() {
    	App app=new App();
    	int expected=0;
    	int actual=app.sum(0 ,0);
        assertEquals(expected,actual);
    }
    
}
