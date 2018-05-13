import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * MyParameterizedTests
 */
@RunWith(Parameterized.class)
public class MyParameterizedTests {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 0, 0, 0 },
            { 1, 1, 2 },
            { 2, 1, 3 },
            { 1, 2, 3 },
            { 2, 2, 4 }
        });
    }

    @Parameter
    public int fa;

    @Parameter(1)
    public int fb;

    @Parameter(2)
    public int fExpected;

    @Test
    public void add_shouldAddTwoIntegers(){
        assertEquals(fExpected, MyAwesomeClass.add(fa, fb));
    }
}