package Oeuvres.Ouvrages;

import Oeuvres.Oeuvres;
import Emplacement.Emplacement;
public class Livres extends Oeuvres {
    /*
    Ranger un livre (rangerLivres())
    Créer un livre, un emplacement()
    Recherche un livre (existeLivres())
    Emprunter un livre (emprunterLivres())
    Rendre un livre (
    */


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
    public Livres(String auteurs,String titres, Integer nb_exemplaires,int statut){
        this.auteurs=auteurs;
        this.titres=titres;
        this.nb_exemplaires=nb_exemplaires;
        super.statut= statut;
    }
    /*rangerLivres()
    *   La méthodes attribuera un emplacement unique au livres
    * elle retournera si la emplacement est deja atribuer , le nombre de place restante
    et L'emplacement du livres
     */
    /*
    * @Name
    * afficherLivres()
    * @Param
    *string auteur,titres
    * integer nb_exmplaire
    * @return
    * "Voici [Titre] écrit par [Auteur] . *Il y en a [nb_exemplaire] exemplaire ici"
    * */
    //public String afficherLivres(Livres l){
       //return  System.out.println("Voici "+this.titres+" écrit par "+this.auteurs+". Il y en a  "+ this.nb_exemplaires+" exemplaire ici");}


    /*
     * @Name
     * existeLivres()
     * @Param
     *
     * livres
     * @return
     * Boolean
     * */
    public boolean existeLivres(){
        boolean existence =false;
        if (titres==titres){
            existence= true;
            return existence;
        }
        return existence;
    }
    /*
        rangerLivres() définit le statut du livres de nondisponibles à disponibles
    */

    public void  rendreLivres(){
        if (super.statut ==1){
            System.out.println("Le livres , "+this.titres+"est déjà disponibles");
        }else
        {   super.setStatut(1);
            System.out.println("Le livres ,"+this.titres+"est maintenant Disponibles");
        }
    }
    public void emprunterLivre(){
        if (super.statut ==1){
            System.out.println("Vous empruntez Le livres , "+this.titres+".");
            super.setStatut(0);
        }else
        {
            System.out.println("Le livres ,"+this.titres+" est indisponibles");
        }
    }
}

