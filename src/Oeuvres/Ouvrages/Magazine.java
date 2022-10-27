package Oeuvres.Ouvrages;

import Oeuvres.Oeuvres;

public class Magazine extends Oeuvres {
    private String parution; //hebodamadaire,trimestriel, quotidiens

    public  Magazine(){};
    public  Magazine(String titres,int statut,String[][][] emplacement,String parution){
        super.titres=titres;
        super.statut=statut;
        super.emplacemnt=emplacement;
        this.parution=parution;
    };
    public String getParution() {
        return parution;
    }


    public void setParution(String parution) {
        this.parution = parution;
    }
    public void  rendreMagazine(){
        if (super.statut ==1){
            System.out.println("Le livres , "+this.titres+"est déjà disponibles");
        }else
        {   super.setStatut(1);
            System.out.println("Le livres ,"+this.titres+"est maintenant Disponibles");
        }
    }
    public void emprunterMagazine(){
        if (super.statut ==1){
            System.out.println("Vous empruntez Le Magazine , "+this.titres+".");
            super.setStatut(0);
        }else
        {
            System.out.println("Le Magazine ,"+this.titres+" est indisponibles");
        }
    }

}
