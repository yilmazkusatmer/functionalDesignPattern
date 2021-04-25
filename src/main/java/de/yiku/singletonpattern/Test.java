package de.yiku.singletonpattern;

public class Test {

    public static void main(String[] args) {
        Singleton instance = SingletonManager.getInstance();
        Singleton instance2 = SingletonManager.getInstance();
        System.out.println(instance.getUuid());
        System.out.println(instance2.getUuid());
    }

}
