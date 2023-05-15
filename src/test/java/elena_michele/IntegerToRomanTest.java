////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    private IntegerToRoman convert;
    @Before
    public void Before(){
        convert = new IntegerToRoman();
    }
    @Test
    public void TestConvertOnetoRoman(){
        assertEquals("I", convert.convert(1));
  
    }
}