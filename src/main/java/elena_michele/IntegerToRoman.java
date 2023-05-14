////////////////////////////////////////////////////////////////////
// ELENA CHILESE 2008074
// MICHELE CAPROTTI 2009988
////////////////////////////////////////////////////////////////////

package elena_michele;

public class IntegerToRoman {
    
    public static String convert(int number){
        String romanNumber="";
        while(number>0){
            if(number==1000){
                romanNumber+="M";
                number=0;
            }
            if(number<1000 && number>=900){
                romanNumber+="C";
                romanNumber+="M";
                number=number-900;
            }
            if(number<900 && number>=500){
                romanNumber+="D";
                number=number-500;
            }
            if(number<500 && number>=400){
                romanNumber+="C";
                romanNumber+="D";
                number=number-400;
            }
            if(number<400 && number>=100){
                romanNumber+="C";
                number=number-100;
            }
            if(number<100 && number>=90){
                romanNumber+="X";
                romanNumber+="C";
                number=number-90;
            }
            if(number<90 && number>=50){
                romanNumber+="L";
                number=number-50;
            }
            if(number<50 && number>=40){
                romanNumber+="X";
                romanNumber+="L";
                number=number-40;
            }
            if(number<40 && number>=10){
                romanNumber+="X";
                number=number-10;
            }
            if(number==9){
                romanNumber+="I";
                romanNumber+="X";
                number=number-9;
            }
            if(number<=8 && number>=5){
                romanNumber+="V";
                number=number-5;
            }
            if(number==4){
                romanNumber+="I";
                romanNumber+="V";
                number=number-4;
            }
            if(number<4 && number!=0){
                while(number!=0){
                    number--;
                    romanNumber+="I";           
                } 
            }   
        }
    return romanNumber;
    }
}