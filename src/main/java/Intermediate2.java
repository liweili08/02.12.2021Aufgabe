import java.util.Scanner;

public class Intermediate2 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine einstellige Zahl:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(eingabe(a));
    }

    public static String eingabe(int a) {
        String[] wortarray;
        wortarray = new String[]{"Null", "Eins", "Zwei", "Drei", "Vier", "Fünf",
                "Sechs", "Sieben", "Acht", "Neun"};
        return wortarray[a];
    }
}
