public class RomanNumeralConverter {

    private static final int M = 1000;
    private static final int D = 500;
    private static final int C = 100;
    private static final int L = 50;
    private static final int X = 10;
    private static final int V = 5;
    private static final int I = 1;

    public static String convertIntegerToRomanNumeral(int input) {
        StringBuilder output = new StringBuilder();

        int remainder = printThousands(input, output);
        remainder = printFiveHundreds(output, remainder);
        remainder = printHundreds(output, remainder);
        remainder = printFifties(output, remainder);
        remainder = printTens(output, remainder);
        remainder = printFives(output, remainder);

        output.append(RomanNumeralConverter.printNumerals("I", remainder));

        return output.toString();
    }

    private static int printFives(StringBuilder output, int remainder) {
        int numberOfFives = remainder / V;
        remainder = remainder % V;
        output.append(RomanNumeralConverter.printNumerals("V", numberOfFives));
        if(remainder >= V - I) {
            output.append(RomanNumeralConverter.printNumerals("IV", 1));
            remainder -= V - I;
        }
        return remainder;
    }

    private static int printTens(StringBuilder output, int remainder) {
        int numberOfTens = remainder / X;
        remainder = remainder % X;
        output.append(RomanNumeralConverter.printNumerals("X", numberOfTens));
        if(remainder >= X - I) {
            output.append(RomanNumeralConverter.printNumerals("IX", 1));
            remainder -= X - I;
        }
        return remainder;
    }

    private static int printFifties(StringBuilder output, int remainder) {
        int numberOfFifties = remainder / L;
        remainder = remainder % L;
        output.append(RomanNumeralConverter.printNumerals("L", numberOfFifties));
        if(remainder >= L - X) {
            output.append(RomanNumeralConverter.printNumerals("XL", 1));
            remainder -= L - X;
        }
        return remainder;
    }

    private static int printHundreds(StringBuilder output, int remainder) {
        int numberOfHundreds = remainder / C;
        remainder = remainder % C;
        output.append(RomanNumeralConverter.printNumerals("C", numberOfHundreds));
        if(remainder >= C - X) {
            output.append(RomanNumeralConverter.printNumerals("XC", 1));
            remainder -= C - X;
        }
        return remainder;
    }

    private static int printFiveHundreds(StringBuilder output, int remainder) {
        int numberOfFiveHundreds = remainder / D;
        remainder = remainder % D;
        output.append(RomanNumeralConverter.printNumerals("D", numberOfFiveHundreds));
        if(remainder >= D - C) {
            output.append(RomanNumeralConverter.printNumerals("CD", 1));
            remainder -= D - C;
        }
        return remainder;
    }

    private static int printThousands(int input, StringBuilder output) {
        int numberOfThousands = input / M;
        int remainder = input % M;
        output.append(RomanNumeralConverter.printNumerals("M", numberOfThousands));
        if(remainder >= M - C) {
            output.append(RomanNumeralConverter.printNumerals("CM", 1));
            remainder -= M - C;
        }
        return remainder;
    }

    private static String printNumerals(String numerals, int numberOfTimes) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < numberOfTimes; i++) {
            output.append(numerals);
        }
        return output.toString();
    }

}
