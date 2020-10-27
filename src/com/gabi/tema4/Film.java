package com.gabi.tema4;

public class Film {
    private String nume;
    private String gen;
    private int durata;

    public Film(String nume,String gen,int durata)
    {
        this.nume=nume;
        this.gen=gen;
        this.durata=durata;
    }

    public Film()
    {
        this("Film necunoscut","Gen necunoscut",0);
    }

    public String toString()
    {
        return "Film: " + nume + "\n" + "Genul: " + gen + "\n" + "Durata: " + durata + " min";
    }

    public String getNume() {
        return nume;
    }

    public String getGen() {
        return gen;
    }

    public int getDurata() {
        return durata;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
