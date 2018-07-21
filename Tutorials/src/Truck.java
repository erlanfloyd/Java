public class Truck {
    private String color;

    // Getter
    public String getColor() {
        return color;
    }

    // Seter
    public void setColor(String c) {
        this.color = c;
    }
}


class Program {
    public static void main(String[] args) {
        Truck v1 = new Truck();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}
