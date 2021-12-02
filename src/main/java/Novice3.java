public class Novice3 {
    public static void main(String[] args){
        double a = -0.4;
        isPositive(a);
    }

    public static void isPositive(double a){
        if (a>0){
            System.out.println(a + " ist positiv.");
        }else{
            System.out.println(a + " ist nonpositiv.");
        }
    }
}
