package com.company;
//Exemplu incapsulare
class Car {
    private int CantitateRoti = 4;
    private String MaterialCarcasa = "Fier";
    private String Culoare = "Rosu";
    private double MarimeRoti = 17.5;

    Car(String Culoare, double MarimeRoti) {
        this.Culoare = Culoare;
        this.MarimeRoti = MarimeRoti;
    }

    //getters
    public int getCantitateRoti() { return this.CantitateRoti; }

    public String getMaterialCarcasa(){
        return this.MaterialCarcasa;
    }

    public String getCuloare(){
        return this.Culoare;
    }

    public double getMarimeRoti(){
        return this.MarimeRoti;
    }

    //setters
    public void setCantitateRoti(int CantitateRoti){
        this.CantitateRoti=CantitateRoti;
    }

    public void setMaterialCarcasa(String MaterialCarcasa){
        this.MaterialCarcasa=MaterialCarcasa;
    }

    public void setCuloare(String Culoare){
        this.Culoare=Culoare;
    }

    public void setCuloare(double MarimeRoti){
        this.MarimeRoti=MarimeRoti;
    }

    @Override
    public String toString(){
        return "class Car--> Mercedes [CantitateRoti : "+CantitateRoti+
                " ,  MaterialCarcasa : "+MaterialCarcasa+
                " , Culoare : "+Culoare+
                " , MarimeRoti : "+MarimeRoti+"]";
    }

}