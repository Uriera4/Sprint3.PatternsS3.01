package n2exercici1.fabriques.telefons;

import n2exercici1.DefaultTelefon;
import n2exercici1.interfaces.Telefon;

public class TelefonGeneric extends DefaultTelefon implements Telefon {

    public TelefonGeneric(String numero) {
        super("", numero);
    }

    @Override
    public DefaultTelefon getTelefon() {
        return this;
    }
}
