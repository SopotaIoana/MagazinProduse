package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CosDeCumparaturi {
    private Map<Imbracaminte, Integer> imbracaminteCumparata;
    private ArrayList<Imbracaminte> lisaHaine;

    public CosDeCumparaturi() {
        imbracaminteCumparata = new HashMap<>();
    }

    public void adaugaImbracaminteInCos(Imbracaminte imbracaminte) {
        int cantitateDisponibila = imbracaminteCumparata.getOrDefault(imbracaminte, 0);
        imbracaminteCumparata.put(imbracaminte, cantitateDisponibila + 1);
    }


    public void cumparaImbracaminte() {
        double pretTotal = 0;
        for (Map.Entry<Imbracaminte, Integer> entry : imbracaminteCumparata.entrySet()) {
            Imbracaminte imbracaminte = entry.getKey();
            int cantitate = entry.getValue();
            int cantitateDisponibila = imbracaminte.getQuantity();

            if (cantitateDisponibila >= cantitate) {
                imbracaminte.setQuantity(cantitateDisponibila - cantitate);
                pretTotal += cantitate * imbracaminte.getPrice();
                System.out.println("- " + cantitate + " x " + imbracaminte.getName() +
                        " (" + imbracaminte.getSize() + ", " + imbracaminte.getColor() +
                        ") - " + (cantitate * imbracaminte.getPrice()) + " lei");
            }
        }
        System.out.println("Pret total: " + pretTotal + " lei");
    }

    public void afiseazaHaineleCumparate() {
        System.out.println("Imbracaminte cumparata: ");
        for (Map.Entry<Imbracaminte, Integer> entry : imbracaminteCumparata.entrySet()) {
            Imbracaminte imbracaminte = entry.getKey();
            int cantitate = entry.getValue();
            System.out.println(imbracaminte.getName() + ": " + cantitate);
        }
    }

    public Map<Imbracaminte, Integer> getImbracaminteCumparata() {
        return imbracaminteCumparata;
    }

    public void setImbracaminteCumparata(Map<Imbracaminte, Integer> imbracaminteCumparata) {
        this.imbracaminteCumparata = imbracaminteCumparata;
    }
}
