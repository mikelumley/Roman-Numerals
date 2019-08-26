public class RomanNumeralConverter {

    public static String convert(int input) {
        StringBuilder output = new StringBuilder();

        int numberOfThouands = input / 1000;
        input = input % 1000;
        output.append(RomanNumeralConverter.printNumerals('M', numberOfThouands));

        if(input >= 900) {
            output.append(RomanNumeralConverter.printNumerals('C', 1));
            output.append(RomanNumeralConverter.printNumerals('M', 1));
            input -= 900;
        }

        int numberOfFiveHundreds = input / 500;
        input = input % 500;
        output.append(RomanNumeralConverter.printNumerals('D', numberOfFiveHundreds));

        if(input >= 400) {
            output.append(RomanNumeralConverter.printNumerals('C', 1));
            output.append(RomanNumeralConverter.printNumerals('D', 1));
            input -= 400;
        }

        int numberOfHundreds = input / 100;
        input = input % 100;
        output.append(RomanNumeralConverter.printNumerals('C', numberOfHundreds));

        if(input >= 90) {
            output.append(RomanNumeralConverter.printNumerals('X', 1));
            output.append(RomanNumeralConverter.printNumerals('C', 1));
            input -= 90;
        }

        int numberOfFifties = input / 50;
        input = input % 50;
        output.append(RomanNumeralConverter.printNumerals('L', numberOfFifties));

        if(input >= 40) {
            output.append(RomanNumeralConverter.printNumerals('X', 1));
            output.append(RomanNumeralConverter.printNumerals('L', 1));
            input -= 40;
        }

        int numberOfTens = input / 10;
        input = input % 10;
        output.append(RomanNumeralConverter.printNumerals('X', numberOfTens));

        if(input >= 9) {
            output.append(RomanNumeralConverter.printNumerals('I', 1));
            output.append(RomanNumeralConverter.printNumerals('X', 1));
            input -= 9;
        }

        int numberOfFives = input / 5;
        input = input % 5;
        output.append(RomanNumeralConverter.printNumerals('V', numberOfFives));

        if(input >= 4) {
            output.append(RomanNumeralConverter.printNumerals('I', 1));
            output.append(RomanNumeralConverter.printNumerals('V', 1));
            input -= 4;
        }

        int numberOfOnes = input;
        output.append(RomanNumeralConverter.printNumerals('I', numberOfOnes));

        return output.toString();
    }

    private static String printNumerals(char numeral, int numberOfTimes) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < numberOfTimes; i++) {
            output.append(numeral);
        }
        return output.toString();
    }

}
