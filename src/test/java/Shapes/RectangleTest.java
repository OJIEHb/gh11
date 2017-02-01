package Shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by andrey on 29.01.17.
 */
public class RectangleTest {
    private Rectangle rectangle = new Rectangle();

    @Before
    public void init(){
         rectangle.setData(3d,4d);
    }

    @After
    public void clear(){
        rectangle=null;
    }

    @Test
    public void calculateArea() throws Exception {
        assertEquals(new BigDecimal(12),rectangle.calculateArea());
    }

    @Test
    public void calculatePerimeter() throws Exception {
        assertEquals(new BigDecimal(14),rectangle.calculatePerimeter());
    }

    @Test
    public void rectangleTriangles() {
        Triangle mockedTriangle = Mockito.mock(Triangle.class);
        when(mockedTriangle.calculateArea()).thenReturn(rectangle.calculateArea().divide(new BigDecimal(2)));
        assertEquals(new BigDecimal(6),mockedTriangle.calculateArea());

    }

}