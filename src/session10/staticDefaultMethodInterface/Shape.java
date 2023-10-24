package session10.staticDefaultMethodInterface;

public interface Shape {
    void draw();
    default void setColor(String color){
        System.err.println(color);
    };
}
