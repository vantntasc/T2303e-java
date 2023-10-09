public class Bird implements  Animal , HomePet{

    @Override
    public String getInfoMessage() {
        return null;
    }

    @Override
    public void move() {
        System.err.println("Fly .....");
    }

    @Override
    public void makeNoise() {
        System.err.println("Bird singing ......");
    }
}
