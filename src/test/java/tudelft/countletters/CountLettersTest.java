package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastLetterR() {
        int words = new CountLetters().count("beaver");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void BothWordsEndWithRandS() {
        int words = new CountLetters().count("jaguar runs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void firstTwoWordsDoNotMatch() {
        int words = new CountLetters().count("huntsman-the-spider");
        Assertions.assertEquals(1, words);
    }

}