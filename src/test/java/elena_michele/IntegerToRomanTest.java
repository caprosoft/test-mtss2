////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvertI() {
        int number = 1;
        String expectedRoman = "I";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   
}