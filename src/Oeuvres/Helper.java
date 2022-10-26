package Oeuvres;

public class Helper {
        private static Helper objetUnique = null;

        // Désactivation du constructeur
        private Helper(){
        }
        // Méthode garantissant la création d'un seul objet
        public static Helper getInstance(){
            // On vérifie si l'objet a déjà été créé
            if(objetUnique == null){
                objetUnique = new Helper();
            }
            return objetUnique;

        }
    }

