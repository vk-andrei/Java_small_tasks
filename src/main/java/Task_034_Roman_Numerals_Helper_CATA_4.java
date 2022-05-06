// Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
// Multiple roman numeral values will be tested for each helper method. Modern Roman numerals are written by
// expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
// In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
// 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
public class Task_034_Roman_Numerals_Helper_CATA_4 {
    public static void main(String[] args) {

        int decimalNumber = 3578;
        String romanNumber = "MMVIII";

        System.out.println(decimalNumber + " - " + toRoman(decimalNumber));
        System.out.println(romanNumber + " - " + fromRoman(romanNumber));
    }

    private static int fromRoman(String romanNumber) {
        int decimalNum = 0;
        int indexLetter = 0;
        //System.out.println(romanNumber);

        while (indexLetter < romanNumber.length()) {
            char charLetter = romanNumber.charAt(indexLetter);
            int letterValue = numFromLetter(charLetter);

            indexLetter++; // next position

            if (indexLetter == romanNumber.length()) {          // no more chars
                decimalNum += letterValue;

            } else {
                int nextLetterValue = numFromLetter(romanNumber.charAt(indexLetter));
                if (letterValue < nextLetterValue) {
                    decimalNum += (nextLetterValue - letterValue);
                    indexLetter++;
                } else {
                    decimalNum += letterValue;
                }
            }
        }


        return decimalNum;
    }

    private static int numFromLetter(char letter) {
        return switch (letter) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new NumberFormatException("Illegal character!!!");
        };
    }


    private static String toRoman(int yearNumber) {
        StringBuilder romanNum = new StringBuilder();

        int year1000 = yearNumber / 1000;
        yearNumber -= 1000 * year1000;
        romanNum.append("M".repeat(year1000));   //      1000

        int year900 = yearNumber / 900;
        yearNumber -= 900 * year900;
        romanNum.append("CM".repeat(year900));   //      900

        int year500 = yearNumber / 500;
        yearNumber -= 500 * year500;
        romanNum.append("D".repeat(year500));   //      500

        int year400 = yearNumber / 400;
        yearNumber -= 400 * year400;
        romanNum.append("CD".repeat(year400));   //      400

        int year100 = yearNumber / 100;
        yearNumber -= 100 * year100;
        romanNum.append("C".repeat(year100));   //      100

        int year90 = yearNumber / 90;
        yearNumber -= 90 * year90;
        romanNum.append("XC".repeat(year90));   //      90

        int year50 = yearNumber / 50;
        yearNumber -= 50 * year50;
        romanNum.append("L".repeat(year50));   //      50

        int year40 = yearNumber / 40;
        yearNumber -= 40 * year40;
        romanNum.append("XL".repeat(year40));   //      40

        int year10 = yearNumber / 10;
        yearNumber -= 10 * year10;
        romanNum.append("X".repeat(year10));   //      10

        int year9 = yearNumber / 9;
        yearNumber -= 9 * year9;
        romanNum.append("IX".repeat(year9));   //      9

        int year5 = yearNumber / 5;
        yearNumber -= 5 * year5;
        romanNum.append("V".repeat(year5));   //      5

        int year4 = yearNumber / 4;
        yearNumber -= 4 * year4;
        romanNum.append("IV".repeat(year4));   //      4

        int year1 = yearNumber;
        romanNum.append("I".repeat(year1));   //      1

        return romanNum.toString();
    }
}