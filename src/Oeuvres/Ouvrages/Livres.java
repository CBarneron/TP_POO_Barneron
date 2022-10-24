package Oeuvres.Ouvrages;

public class Livres {
    //Attributs
    private String auteurs;
    private String titres;
    private Integer nb_exemplaires;
    //Constructeur

    public Livres(String auteurs,String titres, Integer nb_exemplaires){
        this.auteurs=auteurs;
        this.titres=titres;
        this.nb_exemplaires=nb_exemplaires;
    }
    /*
    * @Name
    * afficherLivres()
    * @Param
    *string auteur,titres
    * integer nb_exmplaire
    * @return
    * "Voici [Titre] écrit par [Auteur] . *Il y en a [nb_exemplaire] exemplaire ici"
    * */
    public String afficherLivres(String titres,String auteurs,Integer nb_exemplaires){
    return "Voici "+this.titres+" écrit par "+this.auteurs+". Il y en a  "+ this.nb_exemplaires+" exemplaire ici";
    }


}
