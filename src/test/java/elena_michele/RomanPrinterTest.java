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

    @Test
    public void testPrintV() {
        String expectedOutput = "--      -- \n"+
                                "\\ \\    / / \n"+
                                " \\ \\  / /  \n"+
                                "  \\ \\/ /   \n"+
                                "   \\  /    \n"+
                                "    \\/     \n";
        
        String output = RomanPrinter.print(5);    
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintX() {
        String expectedOutput = " --    --  \n"+
                                " \\ \\  / /  \n"+
                                "  \\  V /   \n"+
                                "   >   <   \n"+
                                "  /  .  \\  \n"+
                                " /__/ \\__\\ \n";
        
        String output = RomanPrinter.print(10);    
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintL() {
        String expectedOutput = " -       \n"+
                                "| |      \n"+
                                "| |      \n"+
                                "| |      \n"+
                                "| |____  \n"+
                                "|______| \n";
        
        String output = RomanPrinter.print(50);    
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintC() {
        String expectedOutput = "  -----  \n"+
                                " / ____| \n"+
                                "| |      \n"+
                                "| |      \n"+
                                "| |____  \n"+
                                " \\_____| \n";
        
        String output = RomanPrinter.print(100);    
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintD() {
        String expectedOutput = " -----   \n"+
                                "|  -- \\  \n"+
                                "| |  | | \n"+
                                "| |  | | \n"+
                                "| |__| | \n"+
                                "|_____/  \n";
        
        String output = RomanPrinter.print(500);    
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintM() {
        String expectedOutput = " --  --  \n"+
                                "|  \\/  | \n"+
                                "| \\  / | \n"+
                                "| |\\/| | \n"+
                                "| |  | | \n"+
                                "|_|  |_| \n"; 
   
        String output = RomanPrinter.print(1000);    
        assertEquals(expectedOutput, output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintIllegalArgument(){
        String expectedOutput="em non è un numero romano";
        String output = RomanPrinter.print("em");
        assertEquals(expectedOutput, output);
    }
    
}


         
        
     