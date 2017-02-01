import Shapes.RectangleTest;
import Shapes.Triangle;
import Shapes.TriangleTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * Created by andrey on 29.01.17.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                RectangleTest.class,
                TriangleTest.class,
                MainTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All test are successful - "+result.wasSuccessful());
    }
}
