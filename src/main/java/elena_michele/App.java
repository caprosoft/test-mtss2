package elena_michele;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    // Mappa dei simboli romani e dei corrispondenti valori
    private static final Map<Character, Integer> ROMAN_NUMERALS = new HashMap<>();
    static {
        ROMAN_NUMERALS.put('I', 1);
        ROMAN_NUMERALS.put('V', 5);
        ROMAN_NUMERALS.put('X', 10);
        ROMAN_NUMERALS.put('L', 50);
        ROMAN_NUMERALS.put('C', 100);
        ROMAN_NUMERALS.put('D', 500);
        ROMAN_NUMERALS.put('M', 1000);
    }

    public static String convert(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 3999");
        }
        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(symbols[i]);
                number -= values[i];
            }
        }
        return result.toString();
    }
}

package elena_michele;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            switch (c) {
                case 'I':
                    sb.append(" III\n");
                    sb.append(" III\n");
                    break;
                case 'V':
                    sb.append(" V V\n");
                    sb.append(" V V\n");
                    break;
                case 'X':
                    sb.append(" X X\n");
                    sb.append(" X X\n");
                    break;
                case 'L':
                    sb.append(" L\n");
                    sb.append(" L\n");
                    sb.append(" L\n");
                    break;
                case 'C':
                    sb.append(" C\n");
                    sb.append(" C\n");
                    sb.append(" C\n");
                    sb.append(" C\n");
                    break;
                case 'D':
                    sb.append(" D\n");
                    sb.append(" D\n");
                    sb.append(" D\n");
                    sb.append(" D\n");
                    sb.append(" D\n");
                    break;
                case 'M':
                    sb.append(" M\n");
                    sb.append(" M\n");
                    sb.append(" M\n");
                    sb.append(" M\n");
                    sb.append(" M\n");
                    break;
            }
        }
        return sb.toString();
    }
}
