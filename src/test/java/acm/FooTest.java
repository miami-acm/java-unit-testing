package acm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FooTest {
    MyClassClass myClassClass;

    @Before
    public void setUp() {
        myClassClass = new MyClassClass();
    }

    @Test
    public void test33() {
        assertEquals(9, myClassClass.foo(3, 3));
    }

    @Test
    public void Test99() {
        assertEquals(81, myClassClass.foo(9, 9));
    }

    @Test
    public void test10045() {
        assertEquals(4500, myClassClass.foo(100, 45));
    }

    @Test
    public void test100M45() {
        assertEquals(-4500, myClassClass.foo(100, -45));
    }

    @Test
    public void testM13M22() {
        assertEquals(286, myClassClass.foo(-13, -22));
    }

    @Test
    public void test042() {
        assertEquals(0, myClassClass.foo(0, 42));
    }

    @Test
    public void test0M42() {
        assertEquals(0, myClassClass.foo(0, -42));
    }

    @Test
    public void test0M0() {
        assertEquals(0, myClassClass.foo(0, -0));
    }

    @Test
    public void testM0M0() {
        assertEquals(0, myClassClass.foo(-0, -0));
    }
}
