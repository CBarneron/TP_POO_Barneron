package Emplacement;

public  class Emplacement{

    /*Mas bibliothéque compte 5 ranger (ABCDE) avec chacune 5 étager comprenant 50 emplacement  donc 5**/
    protected   int [][] etagereTab = new int[5][50];
    protected String [] rangeTab= new String [2];


    public int[][] getEtagereTab() {
        return etagereTab;
    }

    public void setEtagerTab(int[][] emplacementTab) {
        this.etagereTab = etagereTab;
    }

    public String[] getRangeTab() {
        return rangeTab;
    }

    public void setRangeTab(String[] rangeTab) {
        this.rangeTab = rangeTab;
    }
    /// instanciation d'emplacement



};





