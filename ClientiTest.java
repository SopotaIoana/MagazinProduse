package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;


import static org.example.Clienti.createClient;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientiTest{
    @Test
    public void testCreareClientCuVarstaValida(){
        String input = "Ioana\npassword123\nioana@gmail.com\n23\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        Clienti clienti = createClient(scanner);
        assertEquals("Ioana", clienti.getNumeClient());
        assertEquals("password123", clienti.getParolaClient());
        assertEquals("ioana@gmail.com", clienti.getEmailClient());
        assertEquals(23, clienti.getVarstaClient());

    }
    @Test
    public void testCreareClientVarstaInvalida(){
    String input = "Iulia\npassword456\niulia@gmail.com\n12\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Scanner scanner = new Scanner(System.in);

    createClient(scanner);
    }
}
