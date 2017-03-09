package acm;

public class MyClassClassFactoryFactorySingleton {
    private static MyClassClassFactoryFactorySingleton instance;

    private MyClassClassFactoryFactorySingleton() {

    }

    public MyClassClassFactory create() {
        return new MyClassClassFactory();
    }

    public static MyClassClassFactoryFactorySingleton getInstance() {
        if (instance == null) {
            instance = new MyClassClassFactoryFactorySingleton();
        }

        return instance;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof MyClassClassFactoryFactorySingleton;
    }
}
