public class Intermediate3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("#");
            } else if (i % 5 == 0) {
                System.out.println("$");
            } else {
                System.out.println(i);
            }
        }
    }
}
