package acm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassClassTest {
    @Test
    public void test3Squared() {
        assertEquals(MyClassClass.multiply(3, 3), 9);
    }

    @Test
    public void test9Squared() {
        assertEquals(MyClassClass.multiply(9, 9), 81);
    }

    @Test
    public void test100Times45() {
        assertEquals(MyClassClass.multiply(100, 45), 4500);
    }

    @Test
    public void test100TimesNegative45() {
        assertEquals(MyClassClass.multiply(100, -45), -4500);
    }

    @Test
    public void testNegative13TimesNegative22() {
        assertEquals(MyClassClass.multiply(-13, -22), 286);
    }

    @Test
    public void testEmptyArrayContainsNothing() {
        Integer[] list = {};
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            assertEquals(MyClassClass.indexOf(list, i), -1);
        }
    }

    @Test
    public void testAnimalListFindsIndices() {
        String[] list = {"cat", "frog", "cow"};
        assertEquals(MyClassClass.indexOf(list, "cat"), 0);
        assertEquals(MyClassClass.indexOf(list, "frog"), 1);
        assertEquals(MyClassClass.indexOf(list, "cow"), 2);
    }

    @Test
    public void testAnimalListDoesntContainCashew() {
        String[] list = {"cat", "frog", "cow"};
        assertEquals(MyClassClass.indexOf(list, "cashew"), -1);
    }

    @Test
    public void testThreeIsFizz() {
        assertEquals(MyClassClass.fizzBuzz(3), "Fizz");
    }

    @Test
    public void testFiveIsBuzz() {
        assertEquals(MyClassClass.fizzBuzz(5), "Buzz");
    }

    @Test
    public void testFifteenIsFizzBuzz() {
        assertEquals(MyClassClass.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void testTwentyTwoIs22() {
        assertEquals(MyClassClass.fizzBuzz(22), "22");
    }

    @Test
    public void test10004Is10004() {
        assertEquals(MyClassClass.fizzBuzz(10004), "10004");
    }
}
