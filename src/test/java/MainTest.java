

import Shapes.Rectangle;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by andrey on 29.01.17.
 */
public class MainTest {


    @Test
    public void checkInputShape() throws Exception{
        assertTrue(new Main().checkInputShape("TRIANGLE"));
        assertFalse(new Main().checkInputShape("triangl"));
    }

    @Test
    public void showShapeInfo() throws Exception{
        Rectangle mockedRectangle = Mockito.mock(Rectangle.class);
        when(mockedRectangle.toString()).thenReturn("Rectangle");
        assertEquals("Rectangle",new Main().returnShapeInfo(mockedRectangle));
    }

}