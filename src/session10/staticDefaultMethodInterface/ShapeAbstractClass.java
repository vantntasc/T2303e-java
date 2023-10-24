package session10.staticDefaultMethodInterface;

public abstract class ShapeAbstractClass {
    public static void main(String[] args) {
        Rectangular obj  = new Rectangular();
        obj.setColor("Red");
    }
    public void setColor(String color){
        System.err.println(color + " in ShapeAbstractClass");
    };
}
