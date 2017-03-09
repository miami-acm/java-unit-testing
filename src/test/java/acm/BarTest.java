package acm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BarTest {
    MyClassClass myClassClass;

    @Before
    public void setUp() {
        this.myClassClass = new MyClassClass();
    }

    @Test
    public void testNothing() {
        Integer[] x = {};
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            assertEquals(-1, myClassClass.bar(x, i));
        }
    }

    @Test
    public void testAnimals() {
        String[] x = {"cat", "frog", "cow"};
        assertEquals(0, myClassClass.bar(x, "cat"));
        assertEquals(1, myClassClass.bar(x, "frog"));
        assertEquals(2, myClassClass.bar(x, "cow"));
    }

    @Test
    public void testCashew() {
        String[] x = {"cat", "frog", "cow"};
        assertEquals(-1, myClassClass.bar(x, "cashew"));
    }
}
