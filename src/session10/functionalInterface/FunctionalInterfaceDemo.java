package session10.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    // duy nhất 1 phương thức trừu tương , trừ các phương
    // thức của lớp Object
    void doSomething();
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
