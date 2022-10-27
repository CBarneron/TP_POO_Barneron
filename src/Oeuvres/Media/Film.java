package Oeuvres.Media;

import Oeuvres.Oeuvres;

public class Film extends Oeuvres {
    private String realisteur;
    private String acteurPrincipal;


    public Film(){};
    public Film(String titres ,String realisteur,String acteurPrincipal){
        super.titres=titres;
        this.realisteur=realisteur;
        this.acteurPrincipal=acteurPrincipal;
    };
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
