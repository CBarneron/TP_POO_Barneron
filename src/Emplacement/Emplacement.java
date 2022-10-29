package Emplacement;

public  class Emplacement {

    /*Mas bibliothéque compte 5 ranger (ABCDE) avec chacune 5 étager comprenant 50 emplacement  donc 5**/

    private Integer ligne;// correspond au nbr rangée
    private Integer etagere;// etagère comprise entre 1-4
    private Integer place;// emplacement compris entre 0-49
    protected String emplacement = ""+ligne+""+etagere+""+place; // emplacment : ligne+etagere+palce

/*Methode permettant de definire un emplacement compris entre
* 5 lignes, 4 etagere,50 place
*
* */
    public void definirEmplacement(Integer ligne, Integer etagere, Integer place){

     System.out.println("EMplacement r: "+this.ligne +"e: "+this.etagere +"p: "+this.place);

    }






}




