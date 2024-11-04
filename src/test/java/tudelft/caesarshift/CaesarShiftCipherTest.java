package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @Test
    public void lowerCaseLetterWSpaces() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.caesarShiftCipher("a b c  x y z", 25);
        Assertions.assertEquals("z a b  w x y", result);
    }

    @ParameterizedTest(name="message={0}, shift={1}, ciphered={2}")
    @CsvSource({
            "'a b c', 1, 'b c d'",                                               // Simple shift of 1
            "'hello world hola   mundo', 3, 'khoor zruog krod   pxqgr'",         // Shift with spaces preserved
            "'xyz', 2, 'zab'",                                                   // Wrap-around at the end of the alphabet
            "'abc bcd', 25, 'zab abc'",                                          // Shift of 25, a backward shift of 1
            "'everybody loves the sunshine', 6, 'kbkxehuje rubky znk yatynotk'", // Longer text
            "'no shift', 26, 'no shift'",                                        // Shift of 26, No change
            "'backwards', -1, 'azbjvzqcr'",                                      // Negative shift
            "'howdy', 33, 'ovdkf'",                                              // Shift of 33, a shift of 7
            "'z y a', 25, 'y x z'"
    })
    public void eligibleSymbols(String message, int shift, String ciphered) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.caesarShiftCipher(message, shift);
        Assertions.assertEquals(ciphered, result);
    }
}
