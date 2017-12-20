import edu.bsu.nicegierski.CourseOffering;
import org.junit.Assert;
import org.junit.Test;

public class CourseOfferingTest {

    @Test
    public void CourseOfferingBuilderTest_identifyEquality() {
        CourseOffering a = new CourseOffering.Builder()
                .setCrn("12345")
                .setNumber("123")
                .setSection("800")
                .setTitle("Intro Test")
                .build();
        Assert.assertTrue(a.equals(a));
    }
}
