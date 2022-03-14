public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i % 4 == 0);
        for (i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println("Числа четные 4: " + i);
            }
        }

    }
}
