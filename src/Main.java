public class Main {
    public static int fourLoopNumbers(int i) {
        return i % 4 == 0;
    }
    public static void main(String[] args) {
        int i = fourLoopNumbers();
        for (i = 100; i >= 1; i--) {
            System.out.println("Числа кратные 4:" + i);
        }
    }
}

