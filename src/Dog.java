public class Dog implements Animal , HomePet{
    private String name;
    private double height;
    private double weight;

    public Dog(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getInfoMessage() {
        return String.format("Dog name : %s , height : %f , weight : %f"
                , name, height, weight);
    }

    @Override
    public void move() {
        System.err.println(name+" run .....");
    }

    @Override
    public void makeNoise() {
        System.err.println(name+" Bard......");
    }
}
