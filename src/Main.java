import Emplacement.Emplacement;
import Oeuvres.Ouvrages.Livres;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    Livres l1 = new Livres("test","test",2);
    Emplacement E1 = new Emplacement("A",2,2);
    System.out.println(l1);
    System.out.println(E1);

    }
}