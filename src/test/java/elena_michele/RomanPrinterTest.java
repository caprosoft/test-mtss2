////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testPrintI() {
        String expectedOutput = " -----  \n"+
                                "|_   _| \n"+
                                "  | |   \n"+
                                "  | |   \n"+
                                " _| |_  \n"+
                                "|_____| \n";
        
        String output = RomanPrinter.print(1);
        
        assertEquals(expectedOutput, output);
    }
}
