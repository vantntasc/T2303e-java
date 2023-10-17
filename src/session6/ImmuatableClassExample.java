package session6;

public class ImmuatableClassExample {
    public static void main(String[] args) {
        ImmuatableClassExample instance  = new ImmuatableClassExample(1, "name");

        instance = new ImmuatableClassExample(2, "name1");
        System.err.println(instance);

        String a  = "a" ;
        a+= "b"; //

    }

    private final int id ;
    private final String name;

    public ImmuatableClassExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
