package Oeuvres;

import Emplacement.Emplacement;
import com.sun.tools.javac.Main;

import javax.print.attribute.standard.Media;
import java.sql.Date;
import Oeuvres.Oeuvres;
    public class Oeuvres extends Emplacement   {

    protected String titres;
    private Date date;
        private String editeur;
        private String titre;
        private String genre;
        protected int statut;

        public Oeuvres( String titre,String genre ,Date date, String editeur,int statut) {

            this.titre = titre ;
            this.genre = genre;
            this.date = date;
            this.editeur = editeur;
            this.statut = statut;
        }
        public Oeuvres() {

        }

        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public String getEditeur() {
            return editeur;
        }
        public void setEditeur(String editeur) {
            this.editeur = editeur;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        /*
        * RangerOeuvres()
        *  assigne un emplacement à l'oeuvre crée.
        * Il récupere l'objet créer et lui assigne un emplacement.
        * Il retourne l'objet et on emplacement
        * */

    //public rangerOeuvres(Oeures O , Emplacement e){
      //      return


        //}

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        //super.toString();
        return this.getTitre()+" de "+ super.getAuteurs()+" x"+"("+this.getStatut()+")";
    }
}

