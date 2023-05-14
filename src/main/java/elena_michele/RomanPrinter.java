////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

public class RomanPrinter {
    
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        String[] stampaI= new String[6];
        String[] stampaV= new String[6];
        String[] stampaX= new String[6];
        String[] stampaL= new String[6];
        String[] stampaC= new String[6];
        String[] stampaD= new String[6];
        String[] stampaM= new String[6];
        
        stampaI[0]=" -----  ";
        stampaI[1]="|_   _| ";
        stampaI[2]="  | |   ";
        stampaI[3]="  | |   ";
        stampaI[4]=" _| |_  ";
        stampaI[5]="|_____| ";
            
        stampaV[0]="--      -- ";
        stampaV[1]="\\ \\    / / ";
        stampaV[2]=" \\ \\  / /  ";
        stampaV[3]="  \\ \\/ /   ";
        stampaV[4]="   \\  /    ";
        stampaV[5]="    \\/     ";

        stampaX[0]=" --    --  ";
        stampaX[1]=" \\ \\  / /  ";
        stampaX[2]="  \\  V /   ";
        stampaX[3]="   >   <   ";
        stampaX[4]="  /  .  \\  ";
        stampaX[5]=" /__/ \\__\\ ";

        stampaL[0]=" -       ";
        stampaL[1]="| |      ";
        stampaL[2]="| |      ";
        stampaL[3]="| |      ";
        stampaL[4]="| |____  ";
        stampaL[5]="|______| "; 
            
        stampaC[0]="  -----  ";
        stampaC[1]=" / ____| ";
        stampaC[2]="| |      ";
        stampaC[3]="| |      ";
        stampaC[4]="| |____  ";
        stampaC[5]=" \\_____| ";
                
        stampaD[0]=" -----   ";
        stampaD[1]="|  -- \\  ";
        stampaD[2]="| |  | | ";
        stampaD[3]="| |  | | ";
        stampaD[4]="| |__| | ";
        stampaD[5]="|_____/  "; 
            
        stampaM[0]=" --  --  ";
        stampaM[1]="|  \\/  | ";
        stampaM[2]="| \\  / | ";
        stampaM[3]="| |\\/| | ";
        stampaM[4]="| |  | | ";
        stampaM[5]="|_|  |_| "; 
        
        for (int i=0;i<6;i++){
            for(int a=0; a<romanNumber.length(); a++){
                if(romanNumber.charAt(a)=='I')
                    System.out.print(stampaI[i]);
                if(romanNumber.charAt(a)=='V')
                    System.out.print(stampaV[i]);
                if(romanNumber.charAt(a)=='X')
                    System.out.print(stampaX[i]);
                if(romanNumber.charAt(a)=='L')
                    System.out.print(stampaL[i]);
                if(romanNumber.charAt(a)=='C')
                    System.out.print(stampaC[i]);
                if(romanNumber.charAt(a)=='D')
                    System.out.print(stampaD[i]);
                if(romanNumber.charAt(a)=='M')
                    System.out.print(stampaM[i]);
            }
            System.out.println("");
        }
    return null;
}
}