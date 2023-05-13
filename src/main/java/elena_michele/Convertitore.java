
package elena_michele;

import java.util.Scanner;
import java.lang.String;

public class Convertitore {

    public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
       int n=t.nextInt();
       
       String[] romanNumber;
       romanNumber = new String[10];
       int pos=0;
      
       while(n>0){
           
           if(n==1000){
                romanNumber[pos]="M";
                pos++;
                n=0;
           }
           
           if(n<1000 && n>=900){
               romanNumber[pos]="C";
               pos++;
               romanNumber[pos]="M";
               pos++;
               n=n-900;
           }
           
           if(n<900 && n>=500){
                romanNumber[pos]="D";
                pos++;
                n=n-500;
           }
           
           if(n<500 && n>=400){
               romanNumber[pos]="C";
               pos++;
               romanNumber[pos]="D";
               pos++;
               n=n-400;
           }
           
           if(n<400 && n>=100){
                romanNumber[pos]="C";
                pos++;
                n=n-100;
           }
           
           if(n<100 && n>=90){
               romanNumber[pos]="X";
               pos++;
               romanNumber[pos]="C";
               pos++;
               n=n-90;
           }
           
           if(n<90 && n>=50){
                romanNumber[pos]="L";
                pos++;
                n=n-50;
           }
           
           if(n<50 && n>=40){
               romanNumber[pos]="X";
               pos++;
               romanNumber[pos]="L";
               pos++;
               n=n-40;
           }
           
           if(n<40 && n>=10){
                romanNumber[pos]="X";
                pos++;
                n=n-10;
           }
           
           if(n==9){
                romanNumber[pos]="I";
                pos++;
                romanNumber[pos]="X";
                pos++;
                n=n-9;
           }
           
           if(n<=8 && n>=5){
                romanNumber[pos]="V";
                pos++;
                n=n-5;
           }
           
           if(n==4){
                romanNumber[pos]="I";
                pos++;
                romanNumber[pos]="V";
                pos++;
                n=n-4;
           }
           
           if(n<4 && n!=0){
                while(n!=0){
                    n--;
                    romanNumber[pos]="I";
                    pos++;             
                } 
           }   
       
       }//while
       /*for(int i=0;i<romanNumber.length;i++){
           if(romanNumber[i]!=null){
            System.out.print(romanNumber[i]);
           }
       }*/
       //var globale
       String[] stampaI;
       stampaI= new String[6];
       
       String[] stampaV;
       stampaV= new String[6];
       
       String[] stampaX;
       stampaX= new String[6];
       
       String[] stampaL;
       stampaL= new String[6];
       
       String[] stampaC;
       stampaC= new String[6];
       
       String[] stampaD;
       stampaD= new String[6];
       
       String[] stampaM;
       stampaM= new String[6];
       
        stampaI[0]=" -----  ";
        stampaI[1]="|_   _| ";
        stampaI[2]="  | |   ";
        stampaI[3]="  | |   ";
        stampaI[4]=" _| |_  ";
        stampaI[5]="|_____| ";
         
        stampaV[0]="--      -- ";
        stampaV[1]="\\_\\    / / ";
        stampaV[2]=" \\_\\  / /  ";
        stampaV[3]="  \\_\\/ /   ";
        stampaV[4]="   \\  /    ";
        stampaV[5]="    \\/     ";

        stampaX[0]=" --    --  ";
        stampaX[1]=" \\_\\  / /  ";
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
            
        stampaD[0]=" -----   ";
        stampaD[1]="|  -- \\  ";
        stampaD[2]="| |  | | ";
        stampaD[3]="| |  | | ";
        stampaD[4]="| |__| | ";
        stampaD[5]="|_____/  "; 
       
       for (int i=0;i<6;i++){
           for(int a=0; a<10 && romanNumber[a]!=null; a++){
               if("I".equals(romanNumber[a]))
                   System.out.print(stampaI[i]);
               if("V".equals(romanNumber[a]))
                   System.out.print(stampaV[i]);
               if("X".equals(romanNumber[a]))
                   System.out.print(stampaX[i]);
               if("L".equals(romanNumber[a]))
                   System.out.print(stampaL[i]);
               if("C".equals(romanNumber[a]))
                   System.out.print(stampaC[i]);
               if("D".equals(romanNumber[a]))
                   System.out.print(stampaD[i]);
               if("M".equals(romanNumber[a]))
                   System.out.print(stampaM[i]);
           }
          System.out.println("");
       }
       }
       
    }

