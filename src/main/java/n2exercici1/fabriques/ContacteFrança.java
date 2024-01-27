package n2exercici1.fabriques;

import n2exercici1.fabriques.adreces.AdreçaFrança;
import n2exercici1.fabriques.telefons.TelefonFrança;
import n2exercici1.interfaces.FabricaAbstracta;
import n2exercici1.interfaces.Adreça;
import n2exercici1.interfaces.Telefon;

public class ContacteFrança implements FabricaAbstracta {

    @Override
    public Adreça creaAdreça(String carrer, int numero, String ciutat, String codiPostal) {
        return new AdreçaFrança(carrer, numero, ciutat, codiPostal, "França");
    }

    @Override
    public Telefon creaTelefon(String telefon) {
        return new TelefonFrança(telefon);
    }
}
