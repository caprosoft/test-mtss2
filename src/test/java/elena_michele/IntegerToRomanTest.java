////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvertOneToRoman() {
        int number = 1;
        String expectedRoman = "I";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFiveToRoman() {
        int number = 5;
        String expectedRoman = "V";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertTenToRoman() {
        int number = 10;
        String expectedRoman = "X";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertFiftyToRoman() {
        int number = 50;
        String expectedRoman = "L";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertOneHundredToRoman() {
        int number = 100;
        String expectedRoman = "C";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertFiveHundredToRoman() {
        int number = 500;
        String expectedRoman = "D";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }   

    @Test
    public void testConvertOneThousandToRoman() {
        int number = 1000;
        String expectedRoman = "M";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }
    

}