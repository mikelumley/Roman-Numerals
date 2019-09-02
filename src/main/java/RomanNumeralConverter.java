import java.util.*;

public class RomanNumeralConverter {
    private static final int MIN_VALUE_OF_NUMERALS = 1;
    private static final int MAX_VALUE_OF_NUMERALS = 3999;
    private TreeMap<Integer, String> romanNumerals;

    public RomanNumeralConverter() {
        this.romanNumerals = this.createNumeralsToUse();
    }

    private TreeMap<Integer, String> createNumeralsToUse() {
        TreeMap<Integer, String> numeralsToUse = new TreeMap<>(Collections.reverseOrder());
        numeralsToUse.put(1000, "M");
        numeralsToUse.put(900, "CM");
        numeralsToUse.put(500, "D");
        numeralsToUse.put(400, "CD");
        numeralsToUse.put(100, "C");
        numeralsToUse.put(90, "XC");
        numeralsToUse.put(50, "L");
        numeralsToUse.put(40, "XL");
        numeralsToUse.put(10, "X");
        numeralsToUse.put(9, "IX");
        numeralsToUse.put(5, "V");
        numeralsToUse.put(4, "IV");
        numeralsToUse.put(1, "I");
        return numeralsToUse;
    }

    public String convertIntegerToRomanNumeral(int integerToConvert) {
        StringBuilder romanNumeralOutput = new StringBuilder();

        if(integerToConvert < MIN_VALUE_OF_NUMERALS) {
            throw new RuntimeException("Error: Integer too small to convert");
        }

        if(integerToConvert > MAX_VALUE_OF_NUMERALS) {
            throw new RuntimeException("Error: Integer too large to convert");
        }

        for (Map.Entry<Integer, String> numeralAndValue : this.romanNumerals.entrySet()) {
            int numeralValue = numeralAndValue.getKey();
            String numeralSymbol = numeralAndValue.getValue();

            while (integerToConvert >= numeralValue) {
                romanNumeralOutput.append(numeralSymbol);
                integerToConvert -= numeralValue;
            }
        }

        return romanNumeralOutput.toString();
    }
}
