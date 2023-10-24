package session10.staticDefaultMethodInterface;

public interface OrtherShape {
    void draw();
    default void setColor(String color){
        System.err.println(color + " in OrtherShape");
    };
}
