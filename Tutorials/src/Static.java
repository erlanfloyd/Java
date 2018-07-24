public class Static {
    public static void horn() {
        System.out.println("Arriva");
    }
}

public class RRR {
    public static void main(String[] args) {
        Static.horn();
    }
}