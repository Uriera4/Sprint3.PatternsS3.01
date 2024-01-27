package n2exercici1.fabriques;

import n2exercici1.fabriques.adreces.AdreçaAlemania;
import n2exercici1.fabriques.telefons.TelefonAlemania;
import n2exercici1.interfaces.FabricaAbstracta;
import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.Telefon;

public class ContacteAlemania implements FabricaAbstracta {

    @Override
    public Adreça creaAdreça(String carrer, int numero, String ciutat, String codiPostal) {
        return new AdreçaAlemania(carrer, numero, ciutat, codiPostal, "Alemania");
    }

    @Override
    public Telefon creaTelefon(String telefon) {
        return new TelefonAlemania(telefon);
    }
}
