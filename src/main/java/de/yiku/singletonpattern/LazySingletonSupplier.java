package de.yiku.singletonpattern;

import java.util.function.Supplier;

public class LazySingletonSupplier<T> implements Supplier<T> {

    private final Supplier<? extends T> instanceSupplier;
    private volatile T singletonInstance;

    public LazySingletonSupplier(Supplier<? extends T> instanceSupplier) {
        this.instanceSupplier = instanceSupplier;
    }

    private LazySingletonSupplier(T singletonInstance) {
        this.singletonInstance = singletonInstance;
        this.instanceSupplier = null;
    }

    public static <T> LazySingletonSupplier<T> of(T instance) {
        return new LazySingletonSupplier<>(instance);
    }

    public static <T> LazySingletonSupplier<T> ofNullable(T instance) {
        return instance != null ? new LazySingletonSupplier<>(instance) : null;
    }

    public static <T> LazySingletonSupplier<T> of(Supplier<T> supplier) {
        return new LazySingletonSupplier<>(supplier);
    }

    public static <T> LazySingletonSupplier<T> ofNullable(Supplier<T> supplier) {
        return supplier != null ? new LazySingletonSupplier<>(supplier) : null;
    }

    @Override
    public T get() {
        T instance = this.singletonInstance;
        if (instance == null) {
            synchronized (this) {
                instance = this.singletonInstance;
                if (instance == null) {
                    if (this.instanceSupplier != null) {
                        instance = this.instanceSupplier.get();
                    }
                    this.singletonInstance = instance;
                }
            }
        }
        return instance;
    }

}
