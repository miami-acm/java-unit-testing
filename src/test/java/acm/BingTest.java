package acm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BingTest {
    MyClassClass myClassClass;

    @Before
    public void setUp() {
        myClassClass = new MyClassClass();
    }

    @Test
    public void testHello() {
        assertEquals("HELLO WORLD!", myClassClass.bing("hello world!"));
    }

    @Test
    public void testGoodbye() {
        assertEquals("GOODBYE, CRUEL WORLD!", myClassClass.bing("goodbye, world!"));
    }

    @Test
    public void testNonsense() {
        assertEquals("PHP IS NOT THE WORST THING EVER!", myClassClass.bing("PHP is Not the wOrst thing Ever!"));
    }

    @Test
    public void testUtterNonsense() {
        assertEquals("PHP IS GOOD!", myClassClass.bing("PHP is Good!"));
    }

    @Test
    public void testNothing() {
        assertEquals("", myClassClass.bing(""));
    }
}
