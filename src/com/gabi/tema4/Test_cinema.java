package com.gabi.tema4;

public class Test_cinema {
    public static void main(String[] args) {

        Bilet bilet1=new Bilet();
        bilet1.createFilm();
        bilet1.createPersoana();
        System.out.println("Bilet_1\n" + bilet1.toString());
        System.out.println(bilet1.getFilmul());
        System.out.println(bilet1.getPerson());


        Bilet bilet2=new Bilet(10,"10 Decembrie 2020");
        bilet2.createFilm("Tenet","Actiune",120);
        bilet2.createPersoana("Mihaila","Gabriel",20);
        System.out.println("Bilet_2\n"+ bilet2.toString());
        System.out.println(bilet2.getFilmul());
        System.out.println(bilet2.getPerson());


        Bilet bilet3=new Bilet(30,"17 Noiembrie 2020");
        bilet3.createFilm("Made in Italy","Dragoste",100);
        bilet3.createPersoana("Lupsa","Sergiu",16);
        System.out.println("Bilet_3\n"+ bilet3.toString());
        System.out.println(bilet3.getFilmul());
        System.out.println(bilet3.getPerson());


        Bilet bilet4=new Bilet(30,"19 Ianuarie 2021");
        bilet4.createFilm("The New Mutants","Horror",130);
        bilet4.createPersoana("Lupoiu","Raul",35);
        System.out.println("Bilet_4\n"+ bilet4.toString());
        System.out.println(bilet4.getFilmul());
        System.out.println(bilet4.getPerson());


        Bilet bilet5=new Bilet(40,"1 Martie 2021");
        bilet5.createFilm("The War with Grandpa","Comedy",90);
        bilet5.createPersoana("Rus","Ilinca",62);
        System.out.println("Bilet_5\n"+ bilet5.toString());
        System.out.println(bilet5.getFilmul());
        System.out.println(bilet5.getPerson());

        bilet1.reducere(10);
        System.out.println("Noul pret: " + bilet1.getPret() + " lei\n");

        bilet2.reducere(20);
        System.out.println("Noul pret: " + bilet2.getPret() + " lei\n");

        bilet3.reducere(20);
        System.out.println("Noul pret: " + bilet3.getPret() + " lei\n");

        bilet3.reducere(120);
        System.out.println("Noul pret: " + bilet3.getPret() + " lei\n");

        bilet4.reducere(20);
        System.out.println("Noul pret: " + bilet4.getPret() + " lei\n");

        bilet5.reducere(50);
        System.out.println("Noul pret: " + bilet5.getPret() + " lei\n");

    }
}
