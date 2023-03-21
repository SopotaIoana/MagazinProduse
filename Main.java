package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CosDeCumparaturi cos = new CosDeCumparaturi();
            Clienti client = creareClient(scanner);
            while (true) {
                System.out.println("Selecteaza o optiune: ");
                System.out.println("1. Adauga produse in cos");
                System.out.println("2. Cumpara produsele adaugate");
                System.out.println("3. Afiseaza produsele cumparate");
                System.out.println("4. Iesire");
                int optiuneUser = Integer.parseInt(scanner.next());
                switch (optiuneUser) {
                    case 1:
                        System.out.println("Introduceti numele: ");
                        String numeImbracaminte = scanner.next();
                        System.out.println("Introduceti pretul: ");
                        double pretImbracaminte = Double.parseDouble(scanner.next());
                        System.out.println("Introduceti cantitatea: ");
                        int cantitateImbracaminte = Integer.parseInt(scanner.next());
                        System.out.println("Introduceti marimea: ");
                        String marimeImbracaminte = scanner.next();
                        System.out.println("Introduceti culoarea: ");
                        String culoareImbracaminte = scanner.next();

                        Imbracaminte imbracaminte = new Imbracaminte(numeImbracaminte, pretImbracaminte,
                                cantitateImbracaminte, marimeImbracaminte, culoareImbracaminte);
                        cos.adaugaImbracaminteInCos(imbracaminte);
                        break;
                    case 2:
                        cos.cumparaImbracaminte();
                        break;
                    case 3:
                        cos.afiseazaHaineleCumparate();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Optiune invalida! Va rugam sa introduceti o optiune valida.");
                }
            }
        }
    private static Clienti creareClient(Scanner scanner){
        System.out.println("Buna ziua!" +
                "\nPentru a continua este necesar sa va inregistrati");
        System.out.println("Introduceti numele dumneavoastra: ");
        String numeClient = scanner.next();
        System.out.println("Introduceti parola dorita: ");
        String parolaClient = scanner.next();
        System.out.println("Introduceti email-ul dumneavoastra: ");
        String emailClient = scanner.next();
        System.out.println("Introduecti varsta dumneavoastra: ");
        int varstaClient = Integer.parseInt(scanner.next());
        if(varstaClient < 18){
            throw new IllegalArgumentException("Varsta clientului trebuie sa fie de cel putin 18 ani.");
        }
        return new Clienti(numeClient,parolaClient,emailClient,varstaClient);
    }
}
