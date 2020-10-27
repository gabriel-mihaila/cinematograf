package com.gabi.tema4;

public class Bilet {
    private int pret;
    private String data;
    private Film filmul;
    private Persoana person;


    public int reducere(int redus)
    {
        if((this.person.getVarsta() < 18 || this.person.getVarsta() >60) && this.person.getVarsta()!=0)
        {
            if(redus<100) {
                this.pret=this.pret - (this.pret*redus)/100;
                System.out.println("S-a aplicat reducerea de " + redus + "%: ");
            }
            else
                System.out.println("Nu s-a putut aplica reducerea (e mai mare de 100%)");
        }
        else
            System.out.println("Persoana in cauza nu e pensionar si nici copil, nu se aplica reducerea!");


        return this.pret;
    }

    public void createFilm(String nume,String gen,int durata)
    {
        this.filmul=new Film(nume,gen,durata);
    }

    public void createFilm()
    {
        this.filmul=new Film();
    }
    public void createPersoana(String nume,String prenume,int varsta)
    {
        this.person=new Persoana(nume,prenume,varsta);
    }
    public void createPersoana()
    {
        this.person=new Persoana();
    }

    public Bilet(int pret,String data)
    {
        this.pret=pret;
        this.data=data;
    }

    public Bilet()
    {
        this(0,"Data invalida");
    }

    public String toString()
    {
        return "Pretul: " + pret + " lei" + "\n" + "Data: " + data;
    }

    public int getPret() {
        return pret;
    }

    public String getData() {
        return data;
    }

    public Film getFilmul() {
        return filmul;
    }

    public Persoana getPerson() {
        return person;
    }

    public void setPerson(Persoana person) {
        this.person = person;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFilmul(Film filmul) {
        this.filmul = filmul;
    }
}
