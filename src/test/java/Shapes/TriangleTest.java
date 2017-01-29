package Shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

/**
 * Created by andrey on 29.01.17.
 */
public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Before
    public void init(){
        triangle.setData(3d,4d);
    }

    @After
    public void clear(){
        triangle=null;
    }

    @Test
    public void calculatePerimeter() throws Exception {
        assertEquals(new BigDecimal(12),triangle.calculatePerimeter());
    }

    @Test
    public void isValidTriangle() throws Exception {
        assertTrue(triangle.isValidTriangle(4d,4d,4d));
    }

}