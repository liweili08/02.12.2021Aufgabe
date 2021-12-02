import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Intermediate4 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie ein Wort ein:");
        Scanner scan = new Scanner(System.in);
        String str = null;
        ArrayList<String> list = new ArrayList<String>();
        while (!(str = scan.nextLine()).equals("exit")) {
            //System.out.println(str);
            list.add(str);
            System.out.println("Die eingegebene Wörter sind:" + list);
            System.out.println("Bitte geben Sie ein Wort ein:");
//            for (int i=0; i<=list.size(); i++){
//                System.out.println(list.get(i));
//            }
        }
    }

//    public boolean wordList (){
//        System.out.println("Bitte geben Sie ein Wort ein:");
//        Scanner scan = new Scanner(System.in);
//        this.list.add(scan.next());
//        for (int i=0; i<=this.list.size(); i++){
//            System.out.println(this.list.get(i));
//        }
//        return true;
//    }
//    public
//      while(true){wordList();}
}
