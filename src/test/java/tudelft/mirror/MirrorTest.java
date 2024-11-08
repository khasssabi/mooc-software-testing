package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import sun.tools.jconsole.JConsole;

public class MirrorTest {
    @Test
    public void oneCharacter() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("xscx");
        Assertions.assertEquals("x", result);
        System.out.println(result);
    }

    @Test
    public void twoCharacters() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("baobab");
        Assertions.assertEquals("ba", result);
        System.out.println(result);
    }

    @Test
    public void threeCharacters() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("12302321");
        Assertions.assertEquals("123", result);
        System.out.println(result);
    }

    @Test
    public void zeroCharactersMirror() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("abcd");
        Assertions.assertEquals("", result);
        System.out.println(result + "zero characters mirror");
    }

    @Test
    public void emptyString() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("");
        Assertions.assertEquals("", result);
        System.out.println(result + "empty string");
    }

    @Test
    public void oneLetter() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("a");
        Assertions.assertEquals("a", result);
        System.out.println(result);
    }

    @Test
    public void twoSameLetters() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("ww");
        Assertions.assertEquals("w", result);
        System.out.println(result);
    }

    @Test
    public void allMirrorEven() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("deed");
        Assertions.assertEquals("de", result);
        System.out.println(result);
    }

    @Test
    public void allMirrorUneven() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("deded");
        Assertions.assertEquals("ded", result);
        System.out.println(result);
    }

    @Test
    public void palindrome() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("nursesrun");
        Assertions.assertEquals("nurse", result);
        System.out.println(result);
    }

}
