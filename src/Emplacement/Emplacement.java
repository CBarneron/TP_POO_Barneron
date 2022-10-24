package Emplacement;

public  class Emplacement{

    private String rangee;
    private int etagere;
    private int position;

    public Emplacement (){


    }

    public Emplacement (String rangee, int etagere, int position){
        this.rangee = rangee;
        this.etagere=etagere;
        this.position = position;
    }

    public String getRangee() {
        return rangee;
    }

    public void setRangee(String rangee) {
        this.rangee = rangee;
    }

    public int getEtagere() {
        return etagere;
    }

    public void setEtagere(int etagere) {
        this.etagere = etagere;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    /// instanciation d'emplacement



};





