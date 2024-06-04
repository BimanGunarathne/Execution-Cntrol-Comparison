public class example {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        if (true) {
            int num1 = 42;
            System.out.println(num1);
        } else {
            int num2 = 9*6;
            System.out.println(num2);
        }
        // ---------------if false----------------
        if (false) {
            int num1 = 42;
            System.out.println(num1);
        } else {
            int num2 = 9*6;
            System.out.println(num2);
        }
        // ----------------------------------------
        int z = 0;
        if (z == 0) {
            System.out.println(1.1);
        } else {
            System.out.println(-1.1);
        }
    }
}