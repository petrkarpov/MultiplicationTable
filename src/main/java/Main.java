public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.printf("%4d", (x + 1) * (y + 1));
            }
            System.out.println();
        }
    }
}