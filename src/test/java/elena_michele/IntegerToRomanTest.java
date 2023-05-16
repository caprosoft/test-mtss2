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
    
    @Test
    public void testConvertTwoToRoman() {
        int number = 2;
        String expectedRoman = "II";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourToRoman() {
        int number = 4;
        String expectedRoman = "IV";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNineToRoman() {
        int number = 9;
        String expectedRoman = "IX";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourtyToRoman() {
        int number = 40;
        String expectedRoman = "XL";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNintyToRoman() {
        int number = 90;
        String expectedRoman = "XC";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertFourHundredToRoman() {
        int number = 400;
        String expectedRoman = "CD";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNineHundredToRoman() {
        int number = 900;
        String expectedRoman = "CM";
        String actualRoman = IntegerToRoman.convert(number);
        assertEquals(expectedRoman, actualRoman);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testConvertNumberMajorOneThousandtoRoman(){    
        int number = 1001;
        IntegerToRoman.convert(number);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testConvertNumberMinorOnetoRoman(){
        int number = 0;
        IntegerToRoman.convert(number);
    }
       
    @Test(expected = java.lang.NumberFormatException.class)
    public void testConvertStringtoRoman(){
        IntegerToRoman.convert(Integer.parseInt("em"));
    }


}