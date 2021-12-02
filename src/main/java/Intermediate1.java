import java.util.Arrays;

public class Intermediate1 {
    public static void main(String[] args){
        String[] zahlenarray;
        zahlenarray = new String[]{"Eins","Zwei","Drei","Vier","Fünf",
                "Sechs","Sieben","Acht","Neun","Zehn"};
        for (int i = 0; i< zahlenarray.length; i++) {
            System.out.println(zahlenarray[i]);
        }
        String[] zahlarray = new String[10];
        zahlarray[0] = "Eins";
        zahlarray[1] = "Zwei";
        zahlarray[2] = "Drei";
        zahlarray[3] = "Vier";
        zahlarray[4] = "Fünf";
        zahlarray[5] = "Sechs";
        zahlarray[6] = "Sieben";
        zahlarray[7] = "Acht";
        zahlarray[8] = "Neun";
        zahlarray[9] = "Zehn";
        System.out.println(Arrays.toString(zahlarray));
    }
}
