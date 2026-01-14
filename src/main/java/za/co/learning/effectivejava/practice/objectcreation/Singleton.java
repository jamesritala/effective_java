package za.co.learning.effectivejava.practice.objectcreation;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public static Singleton getInstance() {
        return INSTANCE == null ? new Singleton() : INSTANCE;
    }

    private Singleton(){
    }
}
