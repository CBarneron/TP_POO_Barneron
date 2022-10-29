package Emplacement;

public  class Emplacement {

    /*Mas bibliothéque compte 5 ranger (ABCDE) avec chacune 5 étager comprenant 50 emplacement  donc 5**/

    private int ligne;// correspond au nbr rangée
    private int etagere;// etagère comprise entre 1-4
    private int place;// emplacement compris entre 0-49

public Emplacement(){};
public Emplacement(int ligne, int etagere, int place){
    this.ligne=ligne;
    this.etagere = etagere;
    this.place=place;
};
/*Methode permettant de definire un emplacement compris entre
* 5 lignes, 4 etagere,50 place
*
* */
    public void definirEmplacement(int ligne, int etagere, int place){

     System.out.print("Emplacement r: "+this.ligne +"e: "+this.etagere +"p: "+this.place);

    }


    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public void setEtagere(int etagere) {
        this.etagere = etagere;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}




