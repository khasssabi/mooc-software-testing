package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    //@ParameterizedTest(name= "str={0}, expectedResult={1}")
    // @CsvSource("'xxggxx', 'true'", "'xxgxx', 'false'", "'xxggyygxx', 'false'")
    @Test
    public void doubleGInTheMiddle() {
        GHappy gh  = new GHappy();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
        System.out.println("Happy string: " + result);

    }

    @Test
    public void singleG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
        System.out.println("Happy string: " + result);

    }

    @Test
    public void doubleGAndSingleG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xggyyxgx");
        Assertions.assertFalse(result);
        System.out.println("Happy string: " + result);
    }

    @Test
    public void doubleGInTheFront() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("ggxyyx");
        Assertions.assertTrue(result);
        System.out.println("Happy String: " + result);
    }

    @Test
    public void doubleGInTheEnd() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xyyxgg");
        Assertions.assertTrue(result);
        System.out.println("Happy String: " + result);}
}
