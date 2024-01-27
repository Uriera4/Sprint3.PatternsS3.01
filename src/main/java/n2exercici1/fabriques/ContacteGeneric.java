package n2exercici1.fabriques;

import n2exercici1.fabriques.adreces.AdreçaGenerica;
import n2exercici1.fabriques.telefons.TelefonGeneric;
import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.FabricaAbstracta;
import n2exercici1.interfaces.Telefon;

public class ContacteGeneric implements FabricaAbstracta {

    @Override
    public Adreça creaAdreça(String carrer, int numero, String ciutat, String codiPostal) {
        return new AdreçaGenerica(carrer, numero, ciutat, codiPostal, "");
    }

    @Override
    public Telefon creaTelefon(String telefon) {
        return new TelefonGeneric(telefon);
    }
}
