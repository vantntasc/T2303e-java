package session10.staticDefaultMethodInterface;

public class Rectangular extends ShapeAbstractClass implements  Shape ,OrtherShape {
    @Override
    public void draw() {
        System.err.println("Draw Rectangular");
    }

//    @Override
//    public void setColor(String color) {
////        System.err.println(color + " in implement shape - rectangular");
//        Shape.super.setColor(color);
//    }


}
