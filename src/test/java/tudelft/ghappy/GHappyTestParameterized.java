package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTestParameterized {

    @ParameterizedTest(name="gstr={0}")
    @CsvSource({"xxggxx", "ggxxxyx", "xxyyxgg", "xgg", "x", "gg", "ggxxyggyxgg", "xyyggggggxx"})
    public void happyStrings(String gstr) {
        GHappy gh  = new GHappy();
        boolean result = gh.gHappy(gstr);
        Assertions.assertTrue(result);
        System.out.println(result);

    }

    @ParameterizedTest(name = "gstr={0}")
    @CsvSource({"xxgxx", "xxggyygxx", "g", "gxxggxgg", "ghhhsggg"})
    public void unHappyStrings(String gstr) {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy(gstr);
        Assertions.assertFalse(result);
        System.out.println(result);
    }
}
