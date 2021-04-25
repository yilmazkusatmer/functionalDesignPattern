package de.yiku.singletonpattern;

public class SingletonManager {
    private static LazySingletonSupplier<Singleton> instance = LazySingletonSupplier.of(Singleton::new);

    private SingletonManager() {

    }

    public static Singleton getInstance() {
        return instance.get();
    }
}
