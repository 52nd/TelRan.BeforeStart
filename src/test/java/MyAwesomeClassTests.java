import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyAwesomeClassTests {
    
    
    @Test
    public void getStr_Should_returnPropperString(){
        assertEquals("One", MyAwesomeClass.getStr());
    }
}
