import java.util.ArrayList;
import java.util.Scanner;

public class Uzduotis4 {
    public static void main(String[] args) {
        ArrayList<String> zodziai = listoNuskaitymas();
        System.out.println("zodziai = " + zodziai);

        ArrayList<Integer> ilgiai = zodziuIlgiai(zodziai);
        System.out.println("ilgiai = " + ilgiai);
    }

    public static ArrayList<String> listoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<String> listas = new ArrayList<>();
        System.out.println("Įveskite kiek bus list'e skaičių: ");
        int n = skaitytuvas.nextInt();

        skaitytuvas.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite listo " + i + "-ąjį žodį");
            listas.add(skaitytuvas.nextLine());
        }
        return listas;
    }

    public static ArrayList<Integer> zodziuIlgiai(ArrayList<String> zodziai) {
        ArrayList<Integer> ilgiai = new ArrayList<>();
        for (int i = 0; i < zodziai.size(); i++) {
            ilgiai.add(zodziai.get(i).length());
        }
        return ilgiai;
    }
}
