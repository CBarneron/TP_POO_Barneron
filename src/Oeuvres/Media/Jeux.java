package Oeuvres.Media;

import Oeuvres.Oeuvres;

public class Jeux extends Oeuvres {
    private String plateforme;
    private String type;// coop-solo-aventure-énigme-vr ...

    public Jeux(){};
    public Jeux(String plateforme,String type){

        this.plateforme=plateforme;
        this.type=type;

    };
    public Jeux(String titres, String plateforme,String type){
        super.titres=titres;
        this.plateforme=plateforme;
        this.type=type;

    };

}
