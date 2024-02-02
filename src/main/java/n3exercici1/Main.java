package n3exercici1;

import n3exercici1.clientInvoker.Client;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        client.iniciarCommandsCotxe();
        client.executaAccions();

        client.iniciarCommandsBicicleta();
        client.executaAccions();

        client.iniciarCommandsAvio();
        client.executaAccions();

        client.iniciarCommandsVaixell();
        client.executaAccions();

    }
}