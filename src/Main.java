import Emplacement.Emplacement;
import Oeuvres.Helper;
import Oeuvres.Media.Film;
import Oeuvres.Media.Jeux;
import Oeuvres.Ouvrages.Livres;
import Oeuvres.Ouvrages.Magazine;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Livres l1 = new Livres("test", "test", 2);
        //Emplacement E1 = new Emplacement("A",2,2);
        System.out.print(l1);
        //System.out.println(E1);
        //Livres.afficherLivres(1);

        Livres l2 = new Livres(
                "TEST2",
                "TEST2",
                2,
                1);
        ;
        l2.definirEmplacement(1,2,3);
        System.out.println(l2);
       // Livres l3 = new Livres("MArcus", "inconue", 2, 1);
       // Livres l4 = new Livres("inconnue", "romuald", 2, 1);
        //Livres l5 = new Livres("anonyme", "javanese", 2, 1);

        System.out.print(l2);
        l2.rendreLivres();
        l2.emprunterLivre();
        l2.emprunterLivre();
        //Magazine m1 = new Magazine("Magazine1",1,"Le 15 de chaque mois");
        Magazine m2 = new Magazine();
        Magazine m3 = new Magazine();
        Magazine m4 = new Magazine();
        Magazine m5 = new Magazine();
       // m1.emprunterMagazine();
        //m1.rendreMagazine();
        Jeux j1 =new Jeux();
        Jeux j2 =new Jeux();
        Jeux j3 =new Jeux();
        Jeux j4 =new Jeux();
        Jeux j5 =new Jeux();

        Film f1 = new Film();
        Film f2 = new Film();
        Film f3 = new Film();
        Film f4 = new Film();
        Film f5 = new Film();



        ;
    }}
