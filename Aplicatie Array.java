import java.util.Scanner;

public class INT {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ce dimensiune va avea array-ul?");

        int dimensiuneArray = Integer.valueOf(sc.nextLine());

        String[] listaFructe = new String[dimensiuneArray];

        for (int m = 0; m < listaFructe.length; m++) {
            System.out.println("Adauga fructul de la index ul: " + m);
            listaFructe[m] = sc.nextLine();
        }
        System.out.println("Ce element vrei sa afisez?");
        int indexAles = sc.nextInt();
        System.out.println(listaFructe[indexAles]);
    }

}
