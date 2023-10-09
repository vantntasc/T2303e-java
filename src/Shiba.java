public class Shiba extends Dog {  // extends from class : only 1
    private String color;
    private String description;
    public Shiba(String name, double height, double weight) {
        super(name, height, weight);
        this.color = "white";
        this.description = "very clever , loyal";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
