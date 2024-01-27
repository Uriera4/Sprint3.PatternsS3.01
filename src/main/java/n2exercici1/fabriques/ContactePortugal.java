package n2exercici1.fabriques;

import n2exercici1.fabriques.adreces.AdreçaPortugal;
import n2exercici1.fabriques.telefons.TelefonPortugal;
import n2exercici1.interfaces.FabricaAbstracta;
import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.Telefon;

public class ContactePortugal implements FabricaAbstracta {

    @Override
    public Adreça creaAdreça(String carrer, int numero, String ciutat, String codiPostal) {
        return new AdreçaPortugal(carrer, numero, ciutat, codiPostal, "Portugal");
    }

    @Override
    public Telefon creaTelefon(String telefon) {
        return new TelefonPortugal(telefon);
    }
}
