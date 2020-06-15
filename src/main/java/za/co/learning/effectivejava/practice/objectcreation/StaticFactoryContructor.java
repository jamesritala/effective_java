package za.co.learning.effectivejava.practice.objectcreation;

/** Item 1:
 * Consider static factory methods instead of constructors
 * (NB - This technique has no direct equivalent in Design Patterns)
 */
public class StaticFactoryContructor {
    private StaticFactoryContructor(){

    }

    public static StaticFactoryContructor createInstance(){
        return new StaticFactoryContructor();
    }
}