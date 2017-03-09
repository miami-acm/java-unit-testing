package acm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Random;

public class BazTest {
    MyClassClass myClassClass;
    Random rng;

    @Before
    public void setUp() {
        myClassClass = new MyClassClass();
        rng = new Random();
    }

    @Test
    public void testNothing() {
        Integer[] x = {};
        assertEquals(0, myClassClass.baz(x));
    }

    @Test
    public void testAnimals() {
        String[] x = {"cat", "frog", "cow"};
        assertEquals(3, myClassClass.baz(x));
    }

    @Test
    public void testObjects() {
        Object[] x = {1234, MyClassClassFactoryFactorySingleton.getInstance(), new AbstractInterruptibleChannel() {
            @Override
            protected void implCloseChannel() throws IOException {
                throw new IOException("You're doing it wrong!");
            }
        }, MyClassClassFactoryFactorySingleton.getInstance()};
        assertEquals(3, myClassClass.baz(x));
    }

    @Test
    public void testMyClassClassFactoryFactorySingleton() {
        MyClassClassFactoryFactorySingleton[] x = {
                MyClassClassFactoryFactorySingleton.getInstance(),
                MyClassClassFactoryFactorySingleton.getInstance(),
                MyClassClassFactoryFactorySingleton.getInstance()
        };

        assertEquals(1, myClassClass.baz(x));
    }

    @Test
    public void testLoop() {
        ArrayList<Integer> xs = new ArrayList<>();
        xs.add(1234);

        for (int i = 0; i < 134; i++) {
            xs.add(rng.nextInt());
        }

        assertEquals(xs.get(0) - 1100, myClassClass.baz(xs.toArray()));
    }
}
