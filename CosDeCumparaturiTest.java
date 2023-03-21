package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;


public class CosDeCumparaturiTest {
    @Test
    public void testAdaugaImbracaminteInCos(){
        CosDeCumparaturi cosDeCumparaturi = new CosDeCumparaturi();
        Imbracaminte imbracaminte1 = new Imbracaminte("Tricou", 55.99, 10, "S", "Alb");
        Imbracaminte imbracaminte2 = new Imbracaminte("Bluza", 95.99, 15, "M", "Roz");

        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte1);
        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte2);

        Assertions.assertEquals(1,(int) cosDeCumparaturi.getImbracaminteCumparata().get(imbracaminte1));
        Assertions.assertEquals(1,(int) cosDeCumparaturi.getImbracaminteCumparata().get(imbracaminte2));

        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte1);

        Assertions.assertEquals(2,(int) cosDeCumparaturi.getImbracaminteCumparata().get(imbracaminte1));
    }

    @Test
    public void testCumparaImbracaminte(){
        CosDeCumparaturi cosDeCumparaturi = new CosDeCumparaturi();
        Imbracaminte imbracaminte1 = new Imbracaminte("Pantalon", 120.50, 7,"XL", "Negru");
        Imbracaminte imbracaminte2 = new Imbracaminte("Camasa", 135.99, 5,"L", "Bleumarin");

        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte1);
        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte2);

        cosDeCumparaturi.cumparaImbracaminte();

        Assertions.assertEquals(6,imbracaminte1.getQuantity());
        Assertions.assertEquals(4,imbracaminte2.getQuantity());
    }

    @Test
    public void testAfiseazaImbracaminteaCumparata(){
        CosDeCumparaturi cosDeCumparaturi = new CosDeCumparaturi();
        Imbracaminte imbracaminte1 = new Imbracaminte("Jeans", 90.50, 3,"S", "Maro");
        Imbracaminte imbracaminte2 = new Imbracaminte("Tricou", 65.00, 4,"S", "Negru");

        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte1);
        cosDeCumparaturi.adaugaImbracaminteInCos(imbracaminte2);

        cosDeCumparaturi.afiseazaHaineleCumparate();

    }

    @Test
    public void testCreareClientCuVarstaValida(){
        String input = "Ioana\nparola1234\nioana@gmail.com\n23\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

    }
}
