package org.example;


import java.util.Scanner;

public class Clienti extends CosDeCumparaturi{
    private String numeClient;
    private String parolaClient;
    private String emailClient;
    private int varstaClient;

    public Clienti (String numeClient, String parolaClient, String emailClient, int varstaClient){
        this.numeClient = numeClient;
        this.parolaClient = parolaClient;
        this.emailClient = emailClient;
        this.varstaClient = varstaClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getParolaClient() {
        return parolaClient;
    }

    public void setParolaClient(String parolaClient) {
        this.parolaClient = parolaClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public int getVarstaClient() {
        return varstaClient;
    }

    public void setVarstaClient(int varstaClient) {
        this.varstaClient = varstaClient;
    }

    public static Clienti createClient(Scanner scanner) {
        System.out.println("Introduceti numele dumneavoastra: ");
        String numeClient = scanner.next();
        System.out.println("Introduceti parola dorita: ");
        String parolaClient = scanner.next();
        System.out.println("Introduceti email-ul dumneavoastra: ");
        String emailClient = scanner.next();
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varstaClient = Integer.parseInt(scanner.next());

        return new Clienti(numeClient, parolaClient, emailClient, varstaClient);
    }
}
