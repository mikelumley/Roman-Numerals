import java.util.*;

public class RomanNumeralConverter {
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

        for (Map.Entry<Integer, String> numeralAndValue : this.romanNumerals.entrySet()) {
            int numeralValue = numeralAndValue.getKey();
            String numeral = numeralAndValue.getValue();

            while (integerToConvert >= numeralValue) {
                romanNumeralOutput.append(numeral);
                integerToConvert -= numeralValue;
            }
        }

        return romanNumeralOutput.toString();
    }
}
