public class break_operator_loop {
    public static void main(String[] args) {
        int x = 1;
        while (x > 0) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x++;
        }
    }
}
