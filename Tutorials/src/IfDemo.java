public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a less than b");
        if (a == b) System.out.println("a equal b");

        System.out.println();

        c = a - b;
        System.out.println("c have variable -1");

        if (c >= 0) System.out.println("c does not bad");
        if (c < 0) System.out.println("c is bad");

        System.out.println();

        c = b - a;
        System.out.println("c have variable 1");

        if (c >= 0) System.out.println("c does not bad");
        if (c < 0) System.out.println("c is bad");
    }
}
