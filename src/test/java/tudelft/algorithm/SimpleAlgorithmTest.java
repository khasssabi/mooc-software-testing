package tudelft.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleAlgorithmTest {

    @Test
    public void largeEvenNumbers() {
        SimpleAlgorithm sa = new SimpleAlgorithm();
        Boolean result = sa.algorithm(24, 116);
    }

    @Test
    public void notLargeNumbers() {
        SimpleAlgorithm sa = new SimpleAlgorithm();
        Boolean result = sa.algorithm(10, 88);
    }

    @Test
    public void largeOddNumbers() {
        SimpleAlgorithm sa = new SimpleAlgorithm();
        Boolean result = sa.algorithm(231, 101);
    }
}
