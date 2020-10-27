package com.gabi.tema4;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume,String prenume,int varsta)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }

    public Persoana()
    {
        this("Nume invalid","Prenume invalid",0);
    }

    public String toString()
    {
        return "Nume client: " + nume + "\n" + "Prenume client: " + prenume + "\nVarsta client: " + varsta + "\n";
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
