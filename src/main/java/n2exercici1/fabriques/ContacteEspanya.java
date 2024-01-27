package n2exercici1.fabriques;

import n2exercici1.fabriques.adreces.AdreçaEspanya;
import n2exercici1.fabriques.telefons.TelefonEspanya;
import n2exercici1.interfaces.FabricaAbstracta;
import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.Telefon;

public class ContacteEspanya implements FabricaAbstracta {

    @Override
    public Adreça creaAdreça(String carrer, int numero, String ciutat, String codiPostal) {return new AdreçaEspanya(carrer, numero, ciutat, codiPostal, "Espanya");
    }

    @Override
    public Telefon creaTelefon(String telefon) {
        return new TelefonEspanya(telefon);
    }
}
