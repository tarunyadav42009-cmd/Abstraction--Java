/**
 * Represents a base abstraction layer demonstrating abstract class design.
 * This class provides a mix of fully implemented and template methods
 * to define common behaviors and enforce architectural contracts.
 */
abstract class demoabstract {
    public void test() {
        System.out.println("this is a body of class");
    }

    abstract public void pest();

    abstract public void copy();
}