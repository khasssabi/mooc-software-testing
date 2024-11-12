package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void oneCharacterMirror() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("xscx");
        Assertions.assertEquals("x", result);
    }

    @Test
    public void partlyMirror() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("12302321");
        Assertions.assertEquals("123", result);
    }

    @Test
    public void zeroCharactersMirror() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("abcd");
        Assertions.assertEquals("", result);
    }

    @Test
    public void emptyString() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void oneLetter() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void allMirrorEven() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("deed");
        Assertions.assertEquals("deed", result);
    }

    @Test
    public void allMirrorUneven() {
        Mirror mr = new Mirror();
        String result = mr.mirrorEnds("nursesrun");
        Assertions.assertEquals("nursesrun", result);
    }
}
