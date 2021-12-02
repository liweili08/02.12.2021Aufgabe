import java.util.Scanner;

public class Novice5 {
    public static void main(String[] args){
        System.out.println("Wie heißen Sie?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hallo " + name + ", wie geht's?");
    }
}
