import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTests {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void Given_Input1_When_ConvertingToRomanNumerals_Then_ReturnI() {
        int input = 1;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("I", output);
    }

    @Test
    public void Given_Input2_When_ConvertingToRomanNumerals_Then_ReturnII() {
        int input = 2;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("II", output);
    }

    @Test
    public void Given_Input3_When_ConvertingToRomanNumerals_Then_ReturnIII() {
        int input = 3;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("III", output);
    }

    @Test
    public void Given_Input5_When_ConvertingToRomanNumerals_Then_ReturnV() {
        int input = 5;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("V", output);
    }

    @Test
    public void Given_Input10_When_ConvertingToRomanNumerals_Then_ReturnX() {
        int input = 10;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("X", output);
    }

    @Test
    public void Given_Input6_When_ConvertingToRomanNumerals_Then_ReturnVI() {
        int input = 6;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("VI", output);
    }

    @Test
    public void Given_Input4_When_ConvertingToRomanNumerals_Then_ReturnIV() {
        int input = 4;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("IV", output);
    }

    @Test
    public void Given_Input9_When_ConvertingToRomanNumerals_Then_ReturnIX() {
        int input = 9;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("IX", output);
    }

    @Test
    public void Given_Input14_When_ConvertingToRomanNumerals_Then_ReturnXIV() {
        int input = 14;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XIV", output);
    }

    @Test
    public void Given_Input18_When_ConvertingToRomanNumerals_Then_ReturnXVIII() {
        int input = 18;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XVIII", output);
    }

    @Test
    public void Given_Input19_When_ConvertingToRomanNumerals_Then_ReturnXIX() {
        int input = 19;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XIX", output);
    }

    @Test
    public void Given_Input24_When_ConvertingToRomanNumerals_Then_ReturnXXIV() {
        int input = 24;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XXIV", output);
    }

    @Test
    public void Given_Input29_When_ConvertingToRomanNumerals_Then_ReturnXXIX() {
        int input = 29;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XXIX", output);
    }

    @Test
    public void Given_Input40_When_ConvertingToRomanNumerals_Then_ReturnXL() {
        int input = 40;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XL", output);
    }

    @Test
    public void Given_Input50_When_ConvertingToRomanNumerals_Then_ReturnL() {
        int input = 50;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("L", output);
    }

    @Test
    public void Given_Input54_When_ConvertingToRomanNumerals_Then_ReturnLIV() {
        int input = 54;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("LIV", output);
    }

    @Test
    public void Given_Input90_When_ConvertingToRomanNumerals_Then_ReturnXC() {
        int input = 90;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("XC", output);
    }

    @Test
    public void Given_Input400_When_ConvertingToRomanNumerals_Then_ReturnCD() {
        int input = 400;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("CD", output);
    }

    @Test
    public void Given_Input490_When_ConvertingToRomanNumerals_Then_ReturnCDXC() {
        int input = 490;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("CDXC", output);
    }

    @Test
    public void Given_Input900_When_ConvertingToRomanNumerals_Then_ReturnCM() {
        int input = 900;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("CM", output);
    }

    @Test
    public void Given_Input999_When_ConvertingToRomanNumerals_Then_ReturnCMXCIX() {
        int input = 999;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("CMXCIX", output);
    }

    @Test
    public void Given_Input3999_When_ConvertingToRomanNumerals_Then_ReturnMMMCMXCIX() {
        int input = 3999;
        String output = converter.convertIntegerToRomanNumeral(input);
        assertEquals("MMMCMXCIX", output);
    }

    @Test(expected = RuntimeException.class)
    public void Given_Input4000_When_ConvertingToRomanNumerals_Then_ThrowError() {
        int input = 4000;
        String output = converter.convertIntegerToRomanNumeral(input);
    }

    @Test(expected = RuntimeException.class)
    public void Given_Input0_When_ConvertingToRomanNumerals_Then_ThrowError() {
        int input = 0;
        String output = converter.convertIntegerToRomanNumeral(input);
    }
}
