package Oeuvres.Ouvrages;

import Oeuvres.Oeuvres;

public class Magazine extends Oeuvres {
    private String parution; //hebodamadaire,trimestriel, quotidiens

    public  Magazine(){};

    public String getParution() {
        return parution;
    }


    public void setParution(String parution) {
        this.parution = parution;
    }


}
