package Emplacement;

public  class Emplacement {

    /*Mas bibliothéque compte 5 ranger (ABCDE) avec chacune 5 étager comprenant 50 emplacement  donc 5**/


    protected String[][][] emplacemnt = new String[5][4][50];
    private Integer ligne;// correspond au nbr rangée
    private Integer etagere;// etagére comprise entre 1-4
    private Integer place;// emplacement compris entre 0-49

    public Integer getLigne() {
        return ligne;
    }

    public void setLigne(Integer ligne) {
        this.ligne = ligne;
    }

    public Integer getEtagere() {
        return etagere;
    }

    public void setEtagere(Integer etagere) {
        this.etagere = etagere;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }


    public static void Emplacement(String[][][] args) {
        String[][][] e = new String[3][4][5];

        for (int l = 0; l < e.length ; l++) {
            //setLigne(l)
            for (int et = 1; et < e[l].length; et++) {
                //setEtagere(i);
                for (int p = 0; p < e[l][et].length ;p++) {
                    //Setplacement(p)
                    System.out.println("Emplacement[" + l + "," + et +" , "+ p+ "]=" + e[l][et][p]);


                }
            }
        }


    }


}




