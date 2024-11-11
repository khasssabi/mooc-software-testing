package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void simpleAddition() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(5, 7), result);
        System.out.println(result);
    }

    @Test
    public void sumOfDifferentOrders() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 5, 7));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(2, 5, 8), result);
        System.out.println(result);
    }

    @Test
    public void sumWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 8));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(7, 7), result);
    }

    @Test
    public void sumWithCarryOverHundred() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(7, 4));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 8));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(1, 0, 2), result);
        System.out.println(result);
    }

    @Test
    public void sumWithCarryToThousand() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 7, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 8));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(1, 0, 0, 0), result);
        System.out.println(result);
    }

    @Test
    public void sumWithZero() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5, 5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(5, 5), result);
        System.out.println(result);
    }

    @Test
    public void sumOfSingleDigits() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(2), result);
        System.out.println(result);
    }

    @Test
    public void sumOfUnitAndHundred() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 0, 4));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(Arrays.asList(1, 0, 6), result);
        System.out.println(result);
    }
}
